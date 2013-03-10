package com.armandorv.easytravel.expediawsclient.exception;

import com.ean.wsapi.hotel.v3.EanWsError;

/**
 * Exception for hotels problems.
 * 
 * @author armandorv
 * 
 */
public class HotelsException extends Exception {

	private static final long serialVersionUID = 8320876585717392773L;

	private EanWsError eanWsError;

	public HotelsException(EanWsError eanWsError) {
		this.eanWsError = eanWsError;
	}

	@Override
	public String getMessage() {
		return eanWsError == null ? "" : eanWsError.getPresentationMessage();
	}

	public String getDetailedMessage() {
		return eanWsError == null ? "" : eanWsError.getVerboseMessage();
	}

	public String getErrorCategory() {
		return eanWsError != null && eanWsError.getCategory() != null ? eanWsError
				.getCategory().name() : "";
	}

}
