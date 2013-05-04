package com.armandorv.easytravel.web.application.validator;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.web.util.StringsUtils;

@Component
@Scope("request")
public class MailValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {

		StringsUtils.assetThatIsString(value);

		String enteredEmail = (String) value;
		Pattern pattern = Pattern.compile(".+@.+\\.[a-z]+");

		if (!pattern.matcher(enteredEmail).matches()) {
			throw new ValidatorException(error("Invalid mai address",
					enteredEmail));
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
