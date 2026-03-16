package dtos;

public class RespostaUsuarioDto {
    private  String cpf;
    private String nome;
    private String login;

    public RespostaUsuarioDto(String cpf) {
    }

    public String getCpf() { return cpf; }

    public String getNome() { return nome; }

    public String getLongin() { return login; }

    public void setCpf(String cpf) { this.cpf = cpf; }

    public void setNome(String nome) { this.nome = nome; }

    public void setLongin(String longin) { this.login = longin; }
}
