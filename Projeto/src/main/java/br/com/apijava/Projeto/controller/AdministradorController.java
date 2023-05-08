package br.com.apijava.Projeto.controller;

import br.com.apijava.Projeto.persistence.entity.Livro;
import br.com.apijava.Projeto.persistence.entity.Usuario;
import br.com.apijava.Projeto.persistence.interfaces.GerenciamentoDeLivros;
import br.com.apijava.Projeto.persistence.interfaces.GerenciamentoDeUsuarios;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/administrador")

public class AdministradorController  {

    @RequestMapping(value="/livros")
    public List<Livro> listarLivros (){
        return


    }

    @Override
    public Livro atualizarLivro(Livro livro) {
        return null;
    }

    @Override
    public void removerLivro(Livro livro) {

    }

    @Override
    public Livro buscarLivro(Livro livro) {
        return null;
    }

    @Override
    public void cadastrarUsuario(Usuario usuario) {

    }

    @Override
    public Usuario atualizarUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public void removerUsuario(Usuario usuario) {

    }

    @Override
    public Usuario buscarUsuario(Usuario usuario) {
        return null;
    }
}
