package br.com.alpha.service;


import br.com.alpha.model.Usuario;

import java.util.List;

public interface UsuarioService {

    public List<Usuario> listar();
    public Usuario getUsuarioPorLogin(String login);
    public Usuario salvar (Usuario usuario);
    public void deletar(String id);
    public Usuario atualizar(Usuario usuario);
}
