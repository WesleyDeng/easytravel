package com.armandorv.easytravel.web.application.validator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.web.util.StringsUtils;

@Component
@Scope("request")
public class PasswordEqualityValidator implements Validator {

	//private static final String PASSWORD_ID = "password";
	

	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
		StringsUtils.assetThatIsString(value);
		
//		UIComponent password = context.getViewRoot().findComponent(PASSWORD_ID);
//		password.getValueExpression("");
	}


//	private FacesMessage error(String summary, String details) {
//		FacesMessage message = new FacesMessage();
//		message.setSummary(summary);
//		message.setDetail(details);
//		message.setSeverity(FacesMessage.SEVERITY_ERROR);
//		return message;
//	}

}
