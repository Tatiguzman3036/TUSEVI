package com.tusevi.viajesTusevi.controladores;

import com.tusevi.viajesTusevi.dtos.UsuarioDTO;
import com.tusevi.viajesTusevi.modelos.CorreoServicio;
import com.tusevi.viajesTusevi.modelos.Usuario;
import com.tusevi.viajesTusevi.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/api")
public class UsuarioControlador {
    @Autowired
    UsuarioRepositorio usuarioRepositorio;
    @GetMapping("/usuarios")
    public List<UsuarioDTO> getAll() {
        return usuarioRepositorio.findAll()
                .stream()
                .map(UsuarioDTO::new)
                .collect(toList());
    }
    @GetMapping("/usuarios/{id}")

    public UsuarioDTO getClientDTO(@PathVariable Long id){

        return new UsuarioDTO (usuarioRepositorio.findById(id).orElse(null));

    }
    public ResponseEntity<String> registroPaso1(@RequestBody UsuarioDTO usuarioDTO) {
        if (usuarioDTO.getNombre().isBlank()){
            return new ResponseEntity<>("Ingrese el nombre", HttpStatus.FORBIDDEN);
        }
        if (usuarioDTO.getApellido().isBlank()){
            return new ResponseEntity<>("Ingrese el apellido", HttpStatus.FORBIDDEN);
        }
        if (usuarioDTO.getCorreo().isBlank()){
            return new ResponseEntity<>("Ingrese el correo", HttpStatus.FORBIDDEN);
        }
        if (usuarioDTO.getContraseña().isBlank()){
            return new ResponseEntity<>("Ingrese una contraseña",HttpStatus.FORBIDDEN);
        }
        Random random = new Random();
        int codigoValidacion = 100000 + random.nextInt(900000);

        Usuario usuario1 = new Usuario();
        usuario1.setNombre(usuarioDTO.getNombre());
        usuario1.setApellido(usuarioDTO.getApellido());
        usuario1.setCorreo(usuarioDTO.getCorreo());
        usuario1.setContraseña(usuarioDTO.getContraseña());
        usuario1.setCodigoValidacion(codigoValidacion);
        usuarioRepositorio.save(usuario1);
        // Envía el código de validación por correo (implementa esta función)
        CorreoServicio.enviarCodigoValidacion(usuarioDTO.getCorreo(), String.valueOf(codigoValidacion));
        // Devuelve una respuesta exitosa
        return new ResponseEntity<>("Registro exitoso. Por favor, verifica tu correo para continuar.", HttpStatus.OK);
    }

//    @PostMapping("/registro-confirmar")
//    public ResponseEntity<String> registroConfirmar(@RequestParam("correo") String correo, @RequestParam("codigoValidacion") String codigoValidacion) {
//        // Valida el código de validación
//        Usuario usuario = usuarioRepositorio.findByCorreoAndCodigoValidacion(correo, codigoValidacion);
//        if (usuario != null) {
//            // Código de validación válido, actualiza el estado del registro
//            usuario.setRegistroCompleto(true);
//            usuarioRepositorio.save(usuario);
//            // Devuelve una respuesta exitosa
//            return new ResponseEntity<>("Registro confirmado. Puedes completar tu perfil.", HttpStatus.OK);
//        } else {
//            // Código de validación inválido, devuelve un error
//            return new ResponseEntity<>("Código de validación inválido. Por favor, intenta nuevamente.", HttpStatus.BAD_REQUEST);
//        }
//    }
//
//    @PostMapping("/registro-paso2")
//    public ResponseEntity<String> registroPaso2(@RequestBody UsuarioRegistroPaso2DTO registroPaso2DTO) {
//        // Completa el perfil del usuario (por ejemplo, DNI, otros datos)
//        Usuario usuario = usuarioRepositorio.findByCorreo(registroPaso2DTO.getCorreo());
//        if (usuario != null && usuario.isRegistroCompleto()) {
//            // Actualiza el perfil con los datos proporcionados en registroPaso2DTO
//            usuario.setDni(registroPaso2DTO.getDni());
//            // Actualiza otros campos con la información necesaria
//            usuarioRepositorio.save(usuario);
//            // Devuelve una respuesta exitosa
//            return new ResponseEntity<>("Perfil completado exitosamente.", HttpStatus.OK);
//        } else {
//            // Usuario no encontrado o registro no confirmado, devuelve un error
//            return new ResponseEntity<>("Usuario no encontrado o registro no confirmado. Por favor, intenta nuevamente.", HttpStatus.BAD_REQUEST);
//        }
//    }
}