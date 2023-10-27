package com.tusevi.viajesTusevi;

import com.tusevi.viajesTusevi.modelos.Conductor;
import com.tusevi.viajesTusevi.modelos.Usuario;
import com.tusevi.viajesTusevi.repositorios.ConductorRepositorio;
import com.tusevi.viajesTusevi.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ViajesTuseviApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViajesTuseviApplication.class, args);
	}
    @Autowired
    private PasswordEncoder passwordEncoder;
	@Bean
    public CommandLineRunner commandLineRunner(UsuarioRepositorio usuarioRepositorio, ConductorRepositorio conductorRepositorio){
    return args -> {
//        Usuario tatiana = n
//        usuarioRepositorio.save(tatiana);
//        Usuario manuel = new Usuario(25222666,"manuel", "soto", "1166448810","eña@1.com","123");
//        usuarioRepositorio.save(manuel);
        Conductor conductor1 = new Conductor(25000222,"melba", "morel", "1140202020","melba@melba.com","123");
        Conductor conductor2 = new Conductor(45111666, "federico", "lala", "66554488","fede@fede.com","123");
        conductorRepositorio.save(conductor1);
        conductorRepositorio.save(conductor2);
    };
	}
}
