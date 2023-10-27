package com.tusevi.viajesTusevi.configuracion;

import com.tusevi.viajesTusevi.modelos.Conductor;
import com.tusevi.viajesTusevi.modelos.Usuario;
import com.tusevi.viajesTusevi.repositorios.ConductorRepositorio;
import com.tusevi.viajesTusevi.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AutenticacionWeb extends GlobalAuthenticationConfigurerAdapter {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
    @Autowired
    UsuarioRepositorio usuarioRepositorio;
    @Autowired
    ConductorRepositorio conductorRepositorio;

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {

        auth.userDetailsService(inputEmail-> {
            Usuario usuario = usuarioRepositorio.findByCorreo(inputEmail);
            if (usuario != null) {
                String adminEmail = usuario.getCorreo();
                if (adminEmail.contains("admin")){
                    return new User(usuario.getCorreo(), usuario.getContraseña(),
                            AuthorityUtils.createAuthorityList("ADMIN"));
                }else {
                    return new User(usuario.getCorreo(), usuario.getContraseña(),
                            AuthorityUtils.createAuthorityList("USUARIO"));
                }
            } else {
                throw new UsernameNotFoundException("Usuario desconocido:" + inputEmail);
            }
        });
        auth.userDetailsService(inputEmail ->{
            Conductor conductor = conductorRepositorio.findByCorreo(inputEmail);
            if (conductor != null){
                String adminEmail = conductor.getCorreo();
                if (adminEmail.contains("admin")) {
                    return new User(conductor.getCorreo(), conductor.getContraseña(),
                            AuthorityUtils.createAuthorityList("ADMIN"));
                }else {
                    return new User(conductor.getCorreo(), conductor.getContraseña(),
                            AuthorityUtils.createAuthorityList("CONDUCTOR"));
                }
            }else {
                throw new UsernameNotFoundException("Usuario desconocido:" + inputEmail);
            }
    });
    }
}
