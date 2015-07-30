package br.com.alpha.service;


import br.com.alpha.model.Usuario;

import java.util.List;

public interface UsuarioService {

    public List<Usuario> listar();
    public Usuario getUsuarioPorLogin(String login);
}
