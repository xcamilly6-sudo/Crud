package dtos;

public class UsuarioDto {

    private String cpf;
    private String nome;
    private String login;
    private String senha;

    public UsuarioDto(String cpf) {
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getLongin() {
        return login;
    }

    public String getSenha() { return senha; }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLongin(String longin) {
        this.login = longin;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
