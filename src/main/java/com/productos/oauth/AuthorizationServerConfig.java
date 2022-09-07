package com.productos.oauth;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * Autorización de token
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter{

	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter formatterDia = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss,000000000 a");
		ldt.format(formatterDia);
		
		clients.inMemory().withClient("CLR").secret("{noop}CLR2019*").scopes("read", "write")
				.authorizedGrantTypes("client_credentials")
				.accessTokenValiditySeconds(43200).refreshTokenValiditySeconds(43200);
	}
	
}
