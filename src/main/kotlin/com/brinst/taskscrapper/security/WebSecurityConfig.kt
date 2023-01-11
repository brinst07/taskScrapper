package com.brinst.taskscrapper.security

import com.brinst.taskscrapper.security.UserDetailService
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties.Jwt
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer

@Configuration
@EnableWebSecurity
class WebSecurityConfig(
    private val userDetailService: UserDetailService
)  {
    @Bean
    fun passwordEncoder() = BCryptPasswordEncoder()

    @Bean
    fun filterChain(http : HttpSecurity) : SecurityFilterChain {
        http.csrf().disable()
        http.authorizeHttpRequests()
            .requestMatchers("/api/v1/**").hasRole("USER")
            .requestMatchers("/api/v1/login","/api/v1/join").permitAll()
            .requestMatchers("/api/v1/manager/**").hasRole("ADMIN")
        return http.build();
    }

    @Bean
    fun jwt() : Jwt {
        return Jwt(

        )
    }


}