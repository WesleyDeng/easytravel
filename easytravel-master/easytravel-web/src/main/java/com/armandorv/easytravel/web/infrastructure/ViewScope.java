package com.armandorv.easytravel.web.infrastructure;

import java.util.Map;

import javax.faces.context.FacesContext;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

/**
 * Custom Spring scope to replace the JSF View Scope. This class is registered
 * as a Spring bean with the CustomScopeConfigurer.
 * 
 * @author armandorv
 * 
 */
public class ViewScope implements Scope {

	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
		if (FacesContext.getCurrentInstance().getViewRoot() != null) {

			Map<String, Object> viewMap = FacesContext.getCurrentInstance()
					.getViewRoot().getViewMap();

			if (viewMap.containsKey(name)) {
				return viewMap.get(name);
			} else {
				Object object = objectFactory.getObject();
				viewMap.put(name, object);
				return object;
			}

		} else {
			return null;
		}
	}

	@Override
	public Object remove(String name) {
		if (FacesContext.getCurrentInstance().getViewRoot() != null) {
			return FacesContext.getCurrentInstance().getViewRoot().getViewMap()
					.remove(name);
		} else {
			return null;
		}
	}

	@Override
	public void registerDestructionCallback(String arg0, Runnable arg1) {
	}

	@Override
	public String getConversationId() {
		return null;
	}

	@Override
	public Object resolveContextualObject(String arg0) {
		return null;
	}

}