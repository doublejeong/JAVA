package edu.global.ex.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import edu.global.ex.security.CustomUserDetailsService;

@Configuration // @Component+설정
@EnableWebSecurity // 스프링시큐리티필터가 스프링 필터체인에 등록됨
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private CustomUserDetailsService customUserDetailsService;

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		// web.ignoring().requestMatchers(PathRequest.toStaticResources().atCommonLocations());
		web.ignoring().antMatchers("/css/**", "/js/**", "/images/**", "/lib/**");
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("user").password("{noop}user").roles("USER").and()
//                .withUser("admin").password("{noop}admin").roles("ADMIN");

		auth.userDetailsService(customUserDetailsService).passwordEncoder(new BCryptPasswordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// 우선 CSRF설정을 해제한다.
		// 초기 개발시만 해주는게 좋다.
		http.csrf().disable();

		// 시큐리티란? = 인증과 권한
		http.authorizeRequests().antMatchers("/user/**").hasAnyRole("USER").antMatchers("/admin/**").hasAnyRole("ADMIN")
				.antMatchers("/**").permitAll();

		http.formLogin()	// 스프링 시큐리티에 있는 기본 로그인 폼을 사용하겠다.
			.loginPage("/login")	// loginPage() 는 말그대로 로그인할 페이지 url 이고
			.defaultSuccessUrl("/")	// 로그인하면 가는 페이지
			.permitAll();	// 모든 유저가 로그인 화면은 볼 수 있게 한다
		
	}

}