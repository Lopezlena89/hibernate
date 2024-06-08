package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController{
    @Autowired
    private UsuarioDao usuarioDao;
    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id){

        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Luis");
        usuario.setApellido("Lopez");
        usuario.setEmail("luismllv89@gmail.com");
        usuario.setTelefono("84629364723");

        return usuario;
    }
    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }
    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario){
        usuarioDao.registrar(usuario);
    }

    @RequestMapping(value = "api/usuarioasd")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Luis");
        usuario.setApellido("Lopez");
        usuario.setEmail("luismllv89@gmail.com");
        usuario.setTelefono("84629364723");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
        usuarioDao.eliminar(id);
    }

    @RequestMapping(value = "api/usuarioff")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Luis");
        usuario.setApellido("Lopez");
        usuario.setEmail("luismllv89@gmail.com");
        usuario.setTelefono("84629364723");
        return usuario;
    }
}
