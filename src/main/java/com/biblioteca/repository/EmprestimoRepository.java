package com.biblioteca.repository;

import com.biblioteca.model.Emprestimo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmprestimoRepository extends MongoRepository<Emprestimo, String> {
}
