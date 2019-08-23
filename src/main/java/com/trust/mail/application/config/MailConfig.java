package com.trust.mail.application.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import com.trust.mail.common.util.Constants;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class MailConfig {

	private SMTPProperties smtpProperties;
	
	private MailProperties mailProperties;
	
	@Bean
	public JavaMailSender getJavaMailSender() {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost(smtpProperties.getHost());
		mailSender.setPort(smtpProperties.getPort());
		mailSender.setUsername(mailProperties.getUser());
		mailSender.setPassword(mailProperties.getPwd());

		Properties props = mailSender.getJavaMailProperties();
		props.put(Constants.MAIL_PROTOCOL, smtpProperties.getTransportProtocol());
		props.put(Constants.MAIL_SMTP_AUTH, mailProperties.getAuth());
		props.put(Constants.MAIL_SMTP_STARTLS, mailProperties.getStarttlsEnable());
		props.put(Constants.MAIL_DEBUG, mailProperties.getDebug());
		props.put(Constants.MAIL_FROM, mailProperties.getFrom());

		return mailSender;
	}

}
