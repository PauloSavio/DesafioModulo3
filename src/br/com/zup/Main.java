package br.com.zup;

public class Main {

    public static void main(String[] args) {
        try {
            Sistema.cadastrarCliente();
            Sistema.cadastrarVendedor();
            Sistema.cadastrarVenda();
            System.out.println(Sistema.pesquisarCompraPorCliente());
            System.out.println(Sistema.pesquisarVendaPorVendedor());

        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
    }
}
