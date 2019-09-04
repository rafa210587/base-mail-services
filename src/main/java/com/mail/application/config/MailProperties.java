package com.mail.application.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
//@PropertySource("classpath:application-dev.yml ")
@ConfigurationProperties("app.mail")
@Data
public class MailProperties {

	public String from;
	public String debug;
	public String user;
	public String pwd;
	public String ssl;
	public String starttlsEnable;
	public String auth;
}
