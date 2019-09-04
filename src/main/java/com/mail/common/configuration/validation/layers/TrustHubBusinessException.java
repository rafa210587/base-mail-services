package com.mail.common.configuration.validation.layers;

import org.springframework.http.HttpStatus;

import com.mail.common.configuration.validation.domain.TrustHubError;



/**
 * Exception that will occur in the business layer
 * @author alan.franco
 */
public class TrustHubBusinessException extends TrustHubException {

	private static final long serialVersionUID = 1L;

	public TrustHubBusinessException(String msg, TrustHubError trustHubError) {
		super(msg, trustHubError);
	}

	public TrustHubBusinessException(String msg, TrustHubError trustHubError, Throwable cause) {
		super(msg, trustHubError, cause);
	}

	public TrustHubBusinessException(String msg, TrustHubError trustHubError, HttpStatus httpStatus) {
		super(msg, trustHubError, httpStatus);
	}

	public TrustHubBusinessException(String msg, TrustHubError trustHubError, HttpStatus httpStatus, Throwable cause) {
		super(msg, trustHubError, httpStatus, cause);
	}

}
