package com.biblioteca.repository;

import com.biblioteca.model.Livro;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface LivroRepository extends MongoRepository<Livro, String> {
    // Método para buscar livros por título
    List<Livro> findByTitulo(String titulo);

    // Método para buscar livros por autor
    List<Livro> findByAutor(String autor);

    // Método para buscar livros por gênero
    List<Livro> findByGenerosContaining(String genero);

    // Método para buscar livros por ano de publicação
    List<Livro> findByAnoPublicacao(int anoPublicacao);
}
