package com.trust.mail.common.configuration.validation.layers;

import org.springframework.http.HttpStatus;

import com.trust.mail.common.configuration.validation.domain.TrustHubError;

/**
 * Exception that will occur in the control layer
 * @author alan.franco
 */
public class TrustHubControllerException extends TrustHubException {

	private static final long serialVersionUID = 1L;

	public TrustHubControllerException(String msg, TrustHubError trustHubError) {
		super(msg, trustHubError);
	}

	public TrustHubControllerException(String msg, TrustHubError trustHubError, Throwable cause) {
		super(msg, trustHubError, cause);
	}

	public TrustHubControllerException(String msg, TrustHubError trustHubError, HttpStatus httpStatus) {
		super(msg, trustHubError, httpStatus);
	}

	public TrustHubControllerException(String msg, TrustHubError trustHubError, HttpStatus httpStatus, Throwable cause) {
		super(msg, trustHubError, httpStatus, cause);
	}

}
