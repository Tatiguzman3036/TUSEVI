package com.tusevi.viajesTusevi.configuracion;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.logout.HttpStatusReturningLogoutSuccessHandler;

@EnableWebSecurity
@Configuration
class AutorizacionWeb  {

    @Bean
    protected SecurityFilterCha filterChain (HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .requestMatchers("/api/login").permitAll()
                .anyRequest().authenticated();

        http.formLogin()
                .loginPage("/api/login")
                .usernameParameter("correo")
                .passwordParameter("contraseña");

        http.logout()
                .logoutUrl("/api/logout")
                .deleteCookies("JSESSIONID")
                .logoutSuccessHandler(new HttpStatusReturningLogoutSuccessHandler());

        // Desactivar la verificación de tokens CSRF
        http.csrf().disable();

        // Desactivar las opciones de frameOptions para acceder a h2-console
        http.headers().frameOptions().disable();

        // Si el usuario no está autenticado, enviar una respuesta de fallo de autenticación
        http.exceptionHandling().authenticationEntryPoint((req, res, exc) -> res.sendError(HttpServletResponse.SC_UNAUTHORIZED));

        // Si el inicio de sesión tiene éxito, limpiar las banderas que solicitan autenticación
        http.formLogin().successHandler((req, res, auth) -> clearAuthenticationAttributes(req));

        // Si el inicio de sesión falla, enviar una respuesta de fallo de autenticación
        http.formLogin().failureHandler((req, res, exc) -> res.sendError(HttpServletResponse.SC_UNAUTHORIZED));

        return http.build();
    }

    private void clearAuthenticationAttributes(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
        }
    }
}
