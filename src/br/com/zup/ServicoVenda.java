package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {
    private static List<Venda> vendas = new ArrayList<>();

    public static Venda cadastrarVenda(String cpfCliente, String emailVendedor, double valor, String data)throws Exception{
    Cliente cliente = ServicoCliente.pesquisarClientePorCpf(cpfCliente);
    Vendedor vendedor = ServicoVendedor.pesquisarVendedorPorEmail(emailVendedor);
    Venda venda = new Venda(cliente, vendedor, valor, data);
    vendas.add(venda);
    return venda;
    }
}
