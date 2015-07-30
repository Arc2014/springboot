package br.com.alpha.repository;

import br.com.alpha.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByLoginAllIgnoringCase(String login);
}
