package br.com.zup;

public class Vendedor extends Pessoa {

    public Vendedor() {
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(super.toString());
        return retorno.toString();
    }
}
