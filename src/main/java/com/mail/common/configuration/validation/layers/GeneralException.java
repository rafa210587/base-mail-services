package com.mail.common.configuration.validation.layers;

import org.springframework.http.HttpStatus;

import com.mail.common.configuration.validation.domain.GeneralError;


/**
 * Default class that will handle errors in exceptions
 * @author alan.franco
 */
public class GeneralException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	GeneralError trustHubError;
	HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;

	public GeneralException(String msg, GeneralError trustHubError) {
		super(msg);
		this.trustHubError = trustHubError;
	}

	public GeneralException(String msg, GeneralError trustHubError, Throwable cause) {
		super(msg, cause);
		this.trustHubError = trustHubError;
	}

	public GeneralException(String msg, GeneralError trustHubError, HttpStatus httpStatus) {
		super(msg);
		this.trustHubError = trustHubError;
		this.httpStatus = httpStatus;
	}

	public GeneralException(String msg, GeneralError trustHubError, HttpStatus httpStatus, Throwable cause) {
		super(msg, cause);
		this.trustHubError = trustHubError;
		this.httpStatus = httpStatus;
	}

	public GeneralError getTrustHubError() {
		return trustHubError;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

}
