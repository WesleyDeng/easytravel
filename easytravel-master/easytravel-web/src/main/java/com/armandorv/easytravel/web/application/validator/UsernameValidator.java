package com.armandorv.easytravel.web.application.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.web.application.UsersBusinessDelegate;
import com.armandorv.easytravel.web.exception.PresentationException;
import com.armandorv.easytravel.web.util.FacesContextUtils;
import com.armandorv.easytravel.web.util.StringsUtils;

@Component
@Scope("request")
public class UsernameValidator implements Validator {

	@Autowired
	private UsersBusinessDelegate usersBD;

	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
		StringsUtils.assetThatIsString(value);
		String username = (String) value;

		boolean exist;
		try {
			exist = usersBD.alreadyExist(username);

			if (exist) {
				throw new ValidatorException(
						error("Invalid username", username));
			}

		} catch (PresentationException e) {
			FacesContextUtils.addMessageError("Error", e.getMessage());
		}

	}

	private FacesMessage error(String summary, String details) {
		FacesMessage message = new FacesMessage();
		message.setSummary(summary);
		message.setDetail(details);
		message.setSeverity(FacesMessage.SEVERITY_ERROR);
		return message;
	}

}
