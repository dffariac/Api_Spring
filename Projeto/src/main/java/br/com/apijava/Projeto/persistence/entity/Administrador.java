package br.com.apijava.Projeto.persistence.entity;

public class Administrador extends Usuario {

    public Administrador(int id, String nome, String cpf, String endereco, String email, String senha) {
        super(id, nome, cpf, endereco, email, senha);
    }
}
