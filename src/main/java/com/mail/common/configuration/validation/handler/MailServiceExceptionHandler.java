package com.mail.common.configuration.validation.handler;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mail.common.configuration.validation.domain.StandardError;
import com.mail.common.configuration.validation.layers.TrustHubException;
import com.mail.common.util.Constants;

import lombok.extern.slf4j.Slf4j;

/**
 * Generic class that will intercept the error thrown in the access layers or integrations.
 * @author alan.franco
 */
@ControllerAdvice 
@Slf4j
public class MailServiceExceptionHandler {

	@ExceptionHandler(TrustHubException.class)
	public ResponseEntity<StandardError> trustHubException(TrustHubException e, HttpServletRequest request) {
		StandardError err = new StandardError(new Timestamp(System.currentTimeMillis()), e.getTrustHubError().getErrorCode(), e.getTrustHubError().getErrorDescription(), e.getMessage(), request.getRequestURI());		
		if(e != null && e.getMessage() != null) {
			if(e.getMessage().contains(Constants.TIMESTAMP)	
					&& (e.getMessage().contains(Constants.ERRO_CODE) || e.getMessage().contains(Constants.STATUS)) 
						&& (e.getMessage().contains(Constants.ERROR_DESCRIPTION) || e.getMessage().contains(Constants.ERROR)) 
							&& e.getMessage().contains(Constants.MESSAGE) 
								&& e.getMessage().contains(Constants.PATH)){
				String erro = e.getMessage().substring(e.getMessage().indexOf(Constants.OPEN_KEY), e.getMessage().lastIndexOf(Constants.CLOSE_KEY)+1);
				erro = erro.replaceAll(Constants.DOUBLE_QUOTES + Constants.STATUS +  Constants.DOUBLE_QUOTES, Constants.DOUBLE_QUOTES + Constants.ERRO_CODE +  Constants.DOUBLE_QUOTES);
				erro = erro.replaceAll(Constants.DOUBLE_QUOTES + Constants.ERROR +  Constants.DOUBLE_QUOTES, Constants.DOUBLE_QUOTES + Constants.ERROR_DESCRIPTION +  Constants.DOUBLE_QUOTES);
				err = StandardError.getStandardError(erro);
				log.error(err.getMessage());
			}
		}
		String msgErro = new StringBuilder("HEADER: ").append(e.getHttpStatus()).append(" BODY: ").append(err.getMessage()).toString();
		log.error(msgErro, e);   
		return ResponseEntity.status(e.getHttpStatus()).body(err);
	}
}
