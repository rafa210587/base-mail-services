package com.trust.mail.common.configuration.api;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import lombok.Data;

/**
 * Interface that is the context and uri of the applications accessed
 * 
 * @author alan.franco
 */
@Configuration
//@PropertySource("classpath:application-dev.yml ")
@ConfigurationProperties("app.integration.trust-base-mail-services")
@Data
@Primary
public class IntegrationApplicationProperties {

	public String context;
	
	public String uri;
	
	public String securityContext;
	
	public String securityUri;

	public Boolean securityOn;
	

}
