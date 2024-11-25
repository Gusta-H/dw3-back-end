package com.biblioteca.controller;

import com.biblioteca.model.Emprestimo;
import com.biblioteca.repository.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emprestimos")
public class EmprestimoController {

    @Autowired
    private EmprestimoRepository emprestimoRepository;

    // Endpoint para listar todos os empréstimos
    @GetMapping
    public List<Emprestimo> getAll() {
        return emprestimoRepository.findAll();
    }

    // Endpoint para criar um novo empréstimo
    @PostMapping
    public Emprestimo create(@RequestBody Emprestimo emprestimo) {
        return emprestimoRepository.save(emprestimo);
    }

    // Endpoint para atualizar um empréstimo
    @PutMapping("/{id}")
    public Emprestimo update(@PathVariable String id, @RequestBody Emprestimo emprestimo) {
        emprestimo.setId(id);
        return emprestimoRepository.save(emprestimo);
    }
}
