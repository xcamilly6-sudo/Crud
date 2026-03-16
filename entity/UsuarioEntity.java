package entity;

public class UsuarioEntity {

    private String cpf;
    private String nome;
    private String login;
    private String senha;

    public UsuarioEntity(String cpf, String nome, String login, String senha) {
        this.cpf = cpf;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
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

    public String getSenha() {
        return senha;
    }

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

    @Override
    public String toString() {
        return "Usuario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}

