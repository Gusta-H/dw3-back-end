package com.biblioteca.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios")
public class Usuario {
    @Id
    private String id;
    private String nome;
    private String email;
    private String telefone;  // Campo adicionado conforme a collection
    private Endereco endereco; // Campo adicionado conforme a collection

    // Getters e Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {  // Getter para telefone
        return telefone;
    }
    public void setTelefone(String telefone) {  // Setter para telefone
        this.telefone = telefone;
    }

    public Endereco getEndereco() {  // Getter para endereco
        return endereco;
    }
    public void setEndereco(Endereco endereco) {  // Setter para endereco
        this.endereco = endereco;
    }

    // Classe interna para representar o Endereco
    public static class Endereco {
        private String rua;
        private int numero;
        private String bairro;
        private String cidade;
        private String estado;
        private String cep;

        // Getters e Setters
        public String getRua() {
            return rua;
        }
        public void setRua(String rua) {
            this.rua = rua;
        }

        public int getNumero() {
            return numero;
        }
        public void setNumero(int numero) {
            this.numero = numero;
        }

        public String getBairro() {
            return bairro;
        }
        public void setBairro(String bairro) {
            this.bairro = bairro;
        }

        public String getCidade() {
            return cidade;
        }
        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public String getEstado() {
            return estado;
        }
        public void setEstado(String estado) {
            this.estado = estado;
        }

        public String getCep() {
            return cep;
        }
        public void setCep(String cep) {
            this.cep = cep;
        }
    }
}
