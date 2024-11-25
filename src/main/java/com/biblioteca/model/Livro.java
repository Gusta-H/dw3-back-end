package com.biblioteca.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "livros")
public class Livro {
    @Id
    private String id;
    private String titulo;
    private String autor;
    private int anoPublicacao;  // Alterei o nome para refletir o campo "ano_publicacao" da collection
    private String urlCapa;     // Novo campo adicionado conforme a collection
    private List<String> generos; // Novo campo adicionado conforme a collection
    private String descricao;   // Novo campo adicionado conforme a collection
    private int quantidade;     // Novo campo adicionado conforme a collection

    // Getters e Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getUrlCapa() {
        return urlCapa;
    }
    public void setUrlCapa(String urlCapa) {
        this.urlCapa = urlCapa;
    }

    public List<String> getGeneros() {
        return generos;
    }
    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
