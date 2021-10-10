package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Paulo", "paulo@paulo", "123456");
        Vendedor vendedor = new Vendedor("Paulo 2", "email", "1234");
        Venda venda = new Venda(cliente, vendedor, 100, "12/01/2011");

        System.out.println(venda);
    }
}
