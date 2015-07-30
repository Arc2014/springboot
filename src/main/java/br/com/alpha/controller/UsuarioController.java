package br.com.alpha.controller;

import br.com.alpha.model.Usuario;
import br.com.alpha.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Usuario> listarUsuarios () {
        return usuarioService.listar();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/login/{login}")
    public Usuario getUsuarioPorLogin (@PathVariable String login) {
        return usuarioService.getUsuarioPorLogin(login);
    }

    @RequestMapping(method=RequestMethod.POST)
    public Usuario salvar(@RequestBody Usuario usuario) {
        return null;
    }

    @RequestMapping(method=RequestMethod.DELETE, value="{id}")
    public void delete(@PathVariable String id) {

    }
    @RequestMapping(method=RequestMethod.PUT, value="{id}")
    public Usuario update(@PathVariable String id, @RequestBody Usuario usuario) {
        return null;
    }
}
