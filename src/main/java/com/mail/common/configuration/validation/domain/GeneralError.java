package com.mail.common.configuration.validation.domain;

/**
 * Interface that will have to be implemented to define the code and description of the error
 * @author alan.franco
 */
public interface GeneralError {

	Integer getErrorCode();

	void setErrorCode(Integer errorCode);

	String getErrorDescription();

	void setErrorDescription(String errorDescription);

}
