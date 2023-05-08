package br.com.apijava.Projeto.persistence.interfaces;

import br.com.apijava.Projeto.persistence.entity.Usuario;

public interface GerenciamentoDeUsuarios {

    public void cadastrarUsuario(Usuario usuario);

    public Usuario atualizarUsuario(Usuario usuario);

    public void removerUsuario(Usuario usuario);

    public Usuario buscarUsuario(Usuario usuario);
}