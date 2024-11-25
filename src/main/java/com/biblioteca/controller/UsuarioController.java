package com.biblioteca.controller;

import com.biblioteca.model.Usuario;
import com.biblioteca.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Endpoint para listar todos os usuários
    @GetMapping
    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }

    // Endpoint para buscar usuário por ID
    @GetMapping("/{id}")
    public Usuario getById(@PathVariable String id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    // Endpoint para buscar usuário por email
    @GetMapping("/getByEmail")
    public Usuario getByEmail(@RequestParam String email) {
        return usuarioRepository.findByEmail(email);
    }

    // Endpoint para criar um novo usuário
    @PostMapping
    public Usuario create(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
