package br.com.zup;

public class Pessoa {
    private String nome;
    private String email;
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n-------------------------");
        retorno.append("\nNome: " + nome);
        retorno.append("\nCPF: " + cpf);
        retorno.append("\nE-mail: " + email);
        retorno.append("\n-------------------------");
        return retorno.toString();
    }
}
