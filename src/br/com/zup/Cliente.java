package br.com.zup;

public class Cliente extends Pessoa{

    public Cliente() {
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(super.toString());
        return retorno.toString();
    }
}
