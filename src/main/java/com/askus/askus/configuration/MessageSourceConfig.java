package com.askus.askus.configuration;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.MessageSourceAccessor;

/**
 * MessageSourceAccessor configuration exception message-source
 *
 * @Bean MessageSourceAccessor
 */
@Configuration
public class MessageSourceConfig {

	@Bean
	public MessageSourceAccessor messageSourceAccessor(MessageSource messageSource) {
		return new MessageSourceAccessor(messageSource);
	}
}
