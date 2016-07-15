package com.cloudsmartz.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth)
			throws Exception {
		// auth.inMemoryAuthentication().withUser("admin").password("admin")
		// .roles("ADMIN");
		auth.inMemoryAuthentication().withUser("user").password("user")
				.roles("USER");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/admin/**")
				.access("hasRole('USER')").and().formLogin()
				.loginPage("/login")
				.loginProcessingUrl("/j_spring_security_check")
				.failureUrl("/login?error").usernameParameter("username")
				.passwordParameter("password").and().sessionManagement()
				.maximumSessions(1).and()
				.sessionCreationPolicy(SessionCreationPolicy.NEVER).and()
				.logout().logoutUrl("/j_spring_security_logout")
				.logoutSuccessUrl("/login?logout").and().csrf();
	}
}
