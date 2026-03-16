package service;

import com.senai.API.entity.UsuarioEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private List<UsuarioEntity> usuarios = new ArrayList<>();

    public String adicionarUsuario(UsuarioEntity usuario) {

        for (UsuarioEntity u : usuarios) {
            if (u.getLogin().equals(usuario.getLogin())) {
                return "Login já existe!";
            }
        }

        usuarios.add(usuario);
        return "Usuário cadastrado com sucesso!";
    }

    public List<UsuarioEntity> listarUsuarios() {
        return usuarios;
    }

    public UsuarioEntity buscarUsuarioPorCpf(String cpf) {

        for (UsuarioEntity u : usuarios) {
            if (u.getCpf().equals(cpf)) {
                return u;
            }
        }

        return null;
    }

    public String atualizarUsuario(String cpf, String novoNome, String novoLogin, String novaSenha) {

        for (UsuarioEntity u : usuarios) {

            if (u.getCpf().equals(cpf)) {

                for (UsuarioEntity outro : usuarios) {
                    if (outro.getLogin().equals(novoLogin) && !outro.getCpf().equals(cpf)) {
                        return "Login já está em uso!";
                    }
                }

                u.setNome(novoNome);
                u.setLogin(novoLogin);
                u.setSenha(novaSenha);

                return "Usuário atualizado!";
            }
        }

        return "Usuário não encontrado!";
    }

    public String removerUsuario(String cpf) {

        for (UsuarioEntity u : usuarios) {
            if (u.getCpf().equals(cpf)) {
                usuarios.remove(u);
                return "Usuário removido!";
            }
        }

        return "Usuário não encontrado!";
    }
}
