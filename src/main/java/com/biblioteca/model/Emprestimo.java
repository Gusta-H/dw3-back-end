package com.biblioteca.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "emprestimos")
public class Emprestimo {
    @Id
    private String id; // Identificador do empréstimo

    private String usuarioId; // ID do usuário associado ao empréstimo
    private String livroId;   // ID do livro associado ao empréstimo

    private LocalDate dataEmprestimo; // Data do início do empréstimo
    private LocalDate dataDevolucao;  // Data prevista para devolução

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getLivroId() {
        return livroId;
    }

    public void setLivroId(String livroId) {
        this.livroId = livroId;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
