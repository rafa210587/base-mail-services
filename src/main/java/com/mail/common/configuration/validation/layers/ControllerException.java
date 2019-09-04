package com.mail.common.configuration.validation.layers;

import org.springframework.http.HttpStatus;

import com.mail.common.configuration.validation.domain.GeneralError;

/**
 * Exception that will occur in the control layer
 * @author alan.franco
 */
public class ControllerException extends GeneralException {

	private static final long serialVersionUID = 1L;

	public ControllerException(String msg, GeneralError generalError) {
		super(msg, generalError);
	}

	public ControllerException(String msg, GeneralError generalError, Throwable cause) {
		super(msg, generalError, cause);
	}

	public ControllerException(String msg, GeneralError generalError, HttpStatus httpStatus) {
		super(msg, generalError, httpStatus);
	}

	public ControllerException(String msg, GeneralError generalError, HttpStatus httpStatus, Throwable cause) {
		super(msg, generalError, httpStatus, cause);
	}

}
