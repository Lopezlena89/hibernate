package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){

        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Luis");
        usuario.setApellido("Lopez");
        usuario.setEmail("luismllv89@gmail.com");
        usuario.setTelefono("84629364723");



        return usuario;
    }
    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(8263872L);
        usuario.setNombre("Luis");
        usuario.setApellido("Lopez");
        usuario.setEmail("luismllv89@gmail.com");
        usuario.setTelefono("84629364723");

        Usuario usuario2 = new Usuario();
        usuario2.setId(8234542384L);
        usuario2.setNombre("alex");
        usuario2.setApellido("Lopez");
        usuario2.setEmail("alex@gmail.com");
        usuario2.setTelefono("23423423");

        Usuario usuario3 = new Usuario();
        usuario3.setId(343L);
        usuario3.setNombre("abel");
        usuario3.setApellido("Lopez");
        usuario3.setEmail("abel@gmail.com");
        usuario3.setTelefono("846293647298793");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }

    @RequestMapping(value = "usuarioasd")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Luis");
        usuario.setApellido("Lopez");
        usuario.setEmail("luismllv89@gmail.com");
        usuario.setTelefono("84629364723");
        return usuario;
    }

    @RequestMapping(value = "usuario2d")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Luis");
        usuario.setApellido("Lopez");
        usuario.setEmail("luismllv89@gmail.com");
        usuario.setTelefono("84629364723");
        return usuario;
    }

    @RequestMapping(value = "usuarioff")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Luis");
        usuario.setApellido("Lopez");
        usuario.setEmail("luismllv89@gmail.com");
        usuario.setTelefono("84629364723");
        return usuario;
    }
}
