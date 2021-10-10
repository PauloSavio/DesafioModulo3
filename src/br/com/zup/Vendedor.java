package br.com.zup;

public class Vendedor extends Pessoa {

    public Vendedor(String nome, String email, String cpf) {
        super(nome, email, cpf);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(super.toString());
        return retorno.toString();
    }
}
