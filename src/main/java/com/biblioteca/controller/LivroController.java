package com.biblioteca.controller;

import com.biblioteca.model.Livro;
import com.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    // Endpoint para listar todos os livros
    @GetMapping
    public List<Livro> getAll() {
        return livroRepository.findAll();
    }

    // Endpoint para buscar livro por ID
    @GetMapping("/{id}")
    public Livro getById(@PathVariable String id) {
        return livroRepository.findById(id).orElse(null);
    }

    // Endpoint para buscar livro por título
    @GetMapping("/getByTitulo")
    public List<Livro> getByTitulo(@RequestParam String titulo) {
        return livroRepository.findByTitulo(titulo);
    }

    // Endpoint para buscar livro por autor
    @GetMapping("/getByAutor")
    public List<Livro> getByAutor(@RequestParam String autor) {
        return livroRepository.findByAutor(autor);
    }

    // Endpoint para criar um novo livro
    @PostMapping
    public Livro create(@RequestBody Livro livro) {
        return livroRepository.save(livro);
    }

    // Endpoint para atualizar um livro
    @PutMapping("/{id}")
    public Livro update(@PathVariable String id, @RequestBody Livro livro) {
        livro.setId(id); // Garantir que o ID do livro seja atualizado
        return livroRepository.save(livro);
    }

    // Endpoint para excluir um livro
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        livroRepository.deleteById(id);
    }
}
