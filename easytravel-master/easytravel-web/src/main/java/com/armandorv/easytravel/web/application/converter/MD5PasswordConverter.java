package com.armandorv.easytravel.web.application.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

import com.armandorv.easytravel.web.util.StringsUtils;

@FacesConverter(value = "md5PasswordConverter")
public class MD5PasswordConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		return new Md5PasswordEncoder().encodePassword(value, null);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		StringsUtils.assetThatIsString(value);
		String pass = (String) value;
		return new Md5PasswordEncoder().encodePassword(pass, null);
	}

}
