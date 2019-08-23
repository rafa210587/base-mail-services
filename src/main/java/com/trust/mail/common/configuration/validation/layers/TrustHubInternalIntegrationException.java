package com.trust.mail.common.configuration.validation.layers;

import org.springframework.http.HttpStatus;

import com.trust.mail.common.configuration.validation.domain.TrustHubError;

/**
 * Exception that will occur in external integration 
 * @author alan.franco
 */
public class TrustHubInternalIntegrationException extends TrustHubException {

	private static final long serialVersionUID = 1L;

	public TrustHubInternalIntegrationException(String msg, TrustHubError trustHubError) {
		super(msg, trustHubError);
	}

	public TrustHubInternalIntegrationException(String msg, TrustHubError trustHubError, Throwable cause) {
		super(msg, trustHubError, cause);
	}

	public TrustHubInternalIntegrationException(String msg, TrustHubError trustHubError, HttpStatus httpStatus) {
		super(msg, trustHubError, httpStatus);
	}

	public TrustHubInternalIntegrationException(String msg, TrustHubError trustHubError, HttpStatus httpStatus, Throwable cause) {
		super(msg, trustHubError, httpStatus, cause);
	}

}
