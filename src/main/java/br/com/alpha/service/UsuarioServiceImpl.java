package br.com.alpha.service;

import br.com.alpha.model.Usuario;
import br.com.alpha.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    public Usuario getUsuarioPorLogin(String login) {
        return usuarioRepository.findByLoginAllIgnoringCase(login);
    }

    public Usuario salvar (Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deletar(String id) {
        Long idLong = Long.parseLong(id);
        usuarioRepository.delete(idLong);
    }

    public Usuario atualizar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

}
