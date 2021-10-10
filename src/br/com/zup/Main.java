package br.com.zup;

public class Main {

    public static void main(String[] args) {
        try {
            Sistema.cadastrarCliente();
            Sistema.cadastrarVendedor();
            Venda venda = Sistema.cadastrarVenda();
            System.out.println(venda);
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
    }
}
