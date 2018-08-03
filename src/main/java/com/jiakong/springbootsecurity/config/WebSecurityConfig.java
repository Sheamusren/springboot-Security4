package com.jiakong.springbootsecurity.config;

import com.jiakong.springbootsecurity.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * WebSecurityConfig
 *
 * @author admin
 * @date 2018-08-03-11
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    UserDetailsService userService() {
        return new UserService();
    }

    @Override
    public void configure(HttpSecurity web) throws Exception {
        web
                .csrf().disable().authorizeRequests().anyRequest().authenticated()
                .and().formLogin().loginPage("/login").failureUrl("/login?erro").permitAll()
                .and().logout().permitAll();
    }
}
