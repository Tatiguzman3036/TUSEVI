package com.tusevi.viajesTusevi.controladores;

import com.tusevi.viajesTusevi.dtos.UsuarioDTO;
import com.tusevi.viajesTusevi.modelos.Usuario;
import com.tusevi.viajesTusevi.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @PostMapping("/registro")
    public ResponseEntity<String> registro(@RequestBody UsuarioDTO usuarioDTO) {
        // Realiza validaciones y almacena los datos del primer paso en la entidad Usuario
        Usuario usuario = new Usuario();
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setApellido(usuarioDTO.getApellido());
        usuario.setCorreo(usuarioDTO.getCorreo());
        usuario.setContraseña(usuarioDTO.getContraseña());
        usuarioRepositorio.save(usuario);

        // Devuelve una respuesta exitosa
        return new ResponseEntity<>("Paso 1 del registro completado.", HttpStatus.OK);
    }

    @PostMapping("/registro-paso2")
    public ResponseEntity<String> registroPaso2(@RequestBody UsuarioRegistroDTO registroDTO) {
        // Busca el usuario por correo
        Usuario usuario = usuarioRepositorio.findByCorreo(registroDTO.getCorreo());
        if (usuario == null) {
            return new ResponseEntity<>("Usuario no encontrado. Por favor, intenta nuevamente.", HttpStatus.BAD_REQUEST);
        }

        // Completa el registro con los datos del segundo paso
        usuario.setDNI(registroDTO.getDNI());
        usuario.setOtrosCampos(registroDTO.getOtrosCampos()); // Añade todos los campos necesarios

        // Guarda el usuario con los datos completos
        usuarioRepositorio.save(usuario);

        // Devuelve una respuesta exitosa
        return new ResponseEntity<>("Registro completado.", HttpStatus.OK);
    }

}
    String token = generarToken();
    enviarCorreo(registroPaso1DTO.getCorreo(), token);