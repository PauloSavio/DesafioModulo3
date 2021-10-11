package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {
    private static List<Venda> vendas = new ArrayList<>();

    //jogar venda na lista
    public static Venda cadastrarVenda(String cpfCliente, String emailVendedor, double valor, String data) throws Exception {
        Cliente cliente = ServicoCliente.pesquisarClientePorCpf(cpfCliente);
        Vendedor vendedor = ServicoVendedor.pesquisarVendedorPorEmail(emailVendedor);
        Venda venda = new Venda(cliente, vendedor, valor, data);
        vendas.add(venda);
        return venda;
    }

    //pesquisa de compra
    public static List<Venda> pesquisarCompraPorCliente(String cpf) {
        List<Venda> comprasDoCliente = new ArrayList<>();
        for (Venda referencia : vendas) {
            if (referencia.getCliente().getCpf().equals(cpf)) {
                comprasDoCliente.add(referencia);
            }
        }
        return comprasDoCliente;
    }

    //pesquisa de venda
    public static List<Venda> pesquisarVendaPorVendedor(String email) {
        List<Venda> vendasDoVendedor = new ArrayList<>();
        for (Venda referencia : vendas) {
            if (referencia.getVendedor().getEmail().equals(email)) {
                vendasDoVendedor.add(referencia);
            }
        }
        return vendasDoVendedor;
    }

    //método de exibição
    public static void exibirVendas() {
        for (Venda referencia : vendas) {
            System.out.println(referencia);
            //exibir .size?
        }
    }
}
