package controller;

import com.senai.API.dto.UsuarioDto;
import com.senai.API.entity.UsuarioEntity;
import com.senai.API.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    private final UsuarioService usuarioService;

    public Controller(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/usuario")
    public String criarUsuario(@RequestBody UsuarioDto dto) {

        UsuarioEntity usuario = new UsuarioEntity(
                dto.getCpf(),
                dto.getNome(),
                dto.getLogin(),
                dto.getSenha()
        );

        return usuarioService.adicionarUsuario(usuario);
    }

    @GetMapping("/usuarios")
    public List<UsuarioEntity> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    @GetMapping("/usuario/{cpf}")
    public UsuarioEntity buscarUsuario(@PathVariable String cpf) {
        return usuarioService.buscarUsuarioPorCpf(cpf);
    }

    @PutMapping("/usuario/{cpf}")
    public String atualizarUsuario(@PathVariable String cpf, @RequestBody UsuarioDto dto) {

        return usuarioService.atualizarUsuario(
                cpf,
                dto.getNome(),
                dto.getLogin(),
                dto.getSenha()
        );
    }

    @DeleteMapping("/usuario/{cpf}")
    public String removerUsuario(@PathVariable String cpf) {
        return usuarioService.removerUsuario(cpf);
    }
}
