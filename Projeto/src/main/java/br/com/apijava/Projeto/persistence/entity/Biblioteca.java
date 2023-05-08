package br.com.apijava.Projeto.persistence.entity;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro>  livros = new ArrayList<>();
    private ArrayList<Usuario> usuario = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

}
