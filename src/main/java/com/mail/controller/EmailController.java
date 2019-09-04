package com.mail.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mail.application.service.EmailServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;

/*
**
* Controller - Provides APIs
* @author rafael.goncalves
*/
@RestController
@CrossOrigin(value = "*")
@RequestMapping("/trust-base-mail-services/v1")
@AllArgsConstructor
@Api(value = "API - Mail Services - Macro description of the service provided ")
public class EmailController {

	private EmailServiceImpl emailService;

	@ApiOperation(value = "Example to mail services that send Mail")
	@ApiResponses(
			value= {
					@ApiResponse(code = 200, message = "Sucessfull"),
					@ApiResponse(code = 401, message = "Unauthorized"),
					@ApiResponse(code = 403, message = "Access denied"),
					@ApiResponse(code = 500, message = "Erro Internal Server Error: Contact your support \n"
														+ "Mensagem de error:  { timestamp, errorCode, errorDescription, message, path  }  \n"							
														+ "  - errorCode: 1 - Error in api (Batch Services) in the layer Business \n"
														+ "  - errorCode: 2 - Error in api (Batch Services) in the layer Service \n"
														+ "  - errorCode: 3 - Error in api (Batch Services) com integração com o cobrança operação \n"
														+ "  - errorCode: 5 - Error in api (Batch Services) in the Reader layer \n"
														+ "  - errorCode: 6 - Error in api (Batch Services) in the Writer layer \n"
														+ "  - errorCode: 7 - Error in api (Batch Services) in the Processor layer \n"
														+ "  - errorCode: 1000 - Error in api (Base-data-access-services) in the layer Business \n"
														+ "  - errorCode: 2000 - Error in api (Base-data-access-services) in the layer Service \n"
														+ "  - errorCode: 3000 - Error in api (Base-data-access-services) in the Data Access layer \n"
														+ "  - errorCode: 4 - Error in api (trust-base-security-services) in integration with (trust-base-batch-services) \n"

							)
			}
	)
	@GetMapping("/send")
	void executeFileFinancialReconciliationJob() {
		emailService.sendSimpleMessage("victor.nakamatsu@trust.com.vc", "Go CHICKEN GOOOUUOOOOUOOOOUUU!", "Now GONNA FLYYYAAAYYYAYYAYAYYYY");
	}
	
}