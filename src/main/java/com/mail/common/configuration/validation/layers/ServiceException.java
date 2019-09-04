package com.mail.common.configuration.validation.layers;

import org.springframework.http.HttpStatus;

import com.mail.common.configuration.validation.domain.GeneralError;

/**
 * Exception that will occur in the service layer
 * @author alan.franco
 */
public class ServiceException extends GeneralException {

	private static final long serialVersionUID = 1L;

	public ServiceException(String msg, GeneralError generalError) {
		super(msg, generalError);
	}

	public ServiceException(String msg, GeneralError generalError, Throwable cause) {
		super(msg, generalError, cause);
	}

	public ServiceException(String msg, GeneralError generalError, HttpStatus httpStatus) {
		super(msg, generalError, httpStatus);
	}

	public ServiceException(String msg, GeneralError generalError, HttpStatus httpStatus, Throwable cause) {
		super(msg, generalError, httpStatus, cause);
	}

}
