package com.Oauth.Oauth.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityFilter {

    @Bean
    public SecurityFilterChain filter(HttpSecurity httpSecurity) throws Exception
    {
        httpSecurity.authorizeHttpRequests(auth -> auth.requestMatchers("/","/User").permitAll().
                anyRequest().authenticated()).oauth2Login(Customizer.withDefaults());
        return httpSecurity.build();
    }
}
