package com.mail.common.util;


/**
 * Inteface that centralizes the messages used in the collection integration
 * @author alan.franco
 */
public interface Messages {
	
	
	//BUSINESS
	public static final String  BUSINESS_ERROR_ACCESS_MULTIPLE_APIS = "Error accessing multiple APIs in method (ClassExampleBusiness.accessMultipleApis): ";
	
	//SERVICE
	public static final String  SERVICE_ERROR_EXAMPLE_ONE =	"Error accessing the sample service one by the id in the method (ClassExampleService.accessServiceExampleOne): ";
	public static final String  SERVICE_ERROR_EXAMPLE_TWO =	"Error accessing the sample service one by the id in the method (ClassExampleService.accessServiceExampleTwo): ";
	
	//SERVICE VALIDATE ANSWER
	public static final String  SERVICE_ERROR_VALIDATE_ANSWER_EXAMPLE_ONE =	"Error to validate answer to accessing the sample service one by the id in the method (ClassExampleService.validateReturnAccessServiceExampleOne): ";
	public static final String  SERVICE_ERROR_VALIDATE_ANSWER_EXAMPLE_TWO =	"Error to validate answer to accessing the sample service one by the id in the method (ClassExampleService.validateReturnAccessServiceExampleTwo): ";
	
	//SECURITY
	public static final String  SECURITY_NO_AUTHORIZATION = "Null or empty authorization.";
	public static final String  SECURITY_TOKEN_INVALID = "Invalid Token.";
	public static final String  SECURITY_PROFILE_NO_AUTHORIZATION = "Unauthorized profile.";
	public static final String  SECURITY_VALIDAR_TOKEN = "Error in token validation in method: (IntegrationSecurityService.validateToken)";
	public static final String  SECURITY_ERROR_VALIDATE_TOKEN_RESPONSE = "Error while validating token validation response in method: (IntegrationSecurityService.validateResponseToken)";
	
}
