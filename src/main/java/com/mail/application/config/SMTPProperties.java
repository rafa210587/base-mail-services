package com.mail.application.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
//@PropertySource("classpath:application-dev.yml ")
@ConfigurationProperties("app.mail.smtp")
@Data
public class SMTPProperties {

	public String host;
	public int port;
	public String auth;
	public String transportProtocol;
}
