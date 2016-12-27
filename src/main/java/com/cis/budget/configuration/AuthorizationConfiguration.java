/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cis.budget.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;

/**
 *
 * @author bonne_000
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationConfiguration extends AuthorizationServerConfigurerAdapter {
    
    @Autowired
    private AuthenticationManager authenticationManager;
    
    @Override
    public void configure (AuthorizationServerEndpointsConfigurer endPoints) throws Exception {
        endPoints.authenticationManager(authenticationManager);
    }
    
    @Override
    public void configure (ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
           .withClient("client-with-registered-redirect")
           .authorizedGrantTypes("authorization_code")
           .authorities("ROLE_CLIENT")
           .scopes("read", "trust")
           //.resourceIds(RESOURCE_ID)
           .redirectUris("http://anywhere?key=value")
           .secret("secret123")
           .and()
           .withClient("my-client-with-secret")
           .authorizedGrantTypes("client_credentials", "password")
           .authorities("ROLE_CLIENT")
           .scopes("read")
           //.resourceIds(RESOURCE_ID)
           .secret("secret");
    }
}
