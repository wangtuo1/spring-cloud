package learn.springcloud.zuulgateway.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private DataSource dataSource;
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("/", "/error")
					.permitAll()
				.antMatchers("/admin","/admin/**")
					.hasRole("ADMIN")
				.anyRequest()
					.authenticated()
				.and()
					.formLogin()
					.permitAll()
				.and()
					.logout()
					.deleteCookies("JSESSIONID")
					.permitAll()
				.and()
					.csrf()
					.disable();
	}

	@Autowired
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication()
//			.withUser("admin")
//			.password("admin")
//			.roles("ADMIN");
		auth.jdbcAuthentication().dataSource(this.dataSource);
	}
}
