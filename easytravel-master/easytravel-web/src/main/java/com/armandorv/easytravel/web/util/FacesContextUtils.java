package com.armandorv.easytravel.web.util;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

public class FacesContextUtils {

	private FacesContextUtils() {
	}

	public static void addMessage(String summary, String detail,
			Severity severity) {
		FacesMessage message = new FacesMessage(summary, detail);
		FacesContext.getCurrentInstance().addMessage("messages", message);
	}

	public static void addMessageInfo(String summary, String detail) {
		addMessage(summary, detail, FacesMessage.SEVERITY_INFO);
	}

	public static void addMessageError(String summary, String detail) {
		addMessage(summary, detail, FacesMessage.SEVERITY_ERROR);
	}
}
