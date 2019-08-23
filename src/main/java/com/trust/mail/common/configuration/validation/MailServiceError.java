package com.trust.mail.common.configuration.validation;


import com.trust.mail.common.configuration.validation.domain.TrustHubError;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Class representing the code and description of layers or integrations
 * @author alan.franco
 */
@Getter
@AllArgsConstructor
public enum MailServiceError implements TrustHubError {

	ERROR_INTEGRATION_BUSINESS(1, "ERROR IN THE API (INTEGRATION SERVICE) ERROR IN BUSINESS LAYER"), 
	ERROR_INTEGRATION_SERVICE(2, "ERROR IN THE API (SERVICE INTEGRATION) ERROR ON THE SERVICE LAYER"),
	ERROR_INTEGRATION_BASE_DATA_ACCESS_SERVICES(3, "ERROR IN THE API (INTEGRATION SERVICE) IN INTEGRATION WITH TRUST-BASE-DATA-ACCESS-SERVICES"),
	ERROR_INTEGRATION_SECURITY(4, "ERROR IN THE API (INTEGRATION SERVICE) ERROR - INTEGRATION WITH TRUST-BASE-SECURITY-SERVICES");
	 
	Integer errorCode;
	String errorDescription;

	@Override
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	@Override
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}
}
