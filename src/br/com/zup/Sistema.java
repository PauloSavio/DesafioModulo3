package br.com.zup;

import java.util.List;
import java.util.Scanner;

public class Sistema {

    private static Scanner receberDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    private static void chamarMenu() {
        System.out.println("\n---- Bem vinde ao sistema de cadastro de vendas ----");
        System.out.println("\n Escolha uma das opções a seguir:");
        System.out.println("\n Digite [1] para cadastrar cliente");
        System.out.println("\n Digite [2] para cadastrar vendedor");
        System.out.println("\n Digite [3] para cadastrar uma venda");
        System.out.println("\n Digite [4] para exibir clientes");
        System.out.println("\n Digite [5] para exibir vendedores");
        System.out.println("\n Digite [6] para exibir vendas");
        System.out.println("\n Digite [7] para exibir as compras de um cliente");
        System.out.println("\n Digite [8] para exibir as vendas de um vendedor");
        System.out.println("\n Digite [9] para sair do programa");
    }

    public static Cliente cadastrarCliente ()throws Exception{
        String nome = receberDados("Digite o nome do cliente: ").nextLine();
        String email = receberDados("Digite o email do cliente:").nextLine();
        String cpf = receberDados("Digite o CPF do cliente: ").nextLine();
        return ServicoCliente.cadastrarCliente(nome, email, cpf);

    }

    public static Vendedor cadastrarVendedor ()throws Exception{
        String nome = receberDados("Digite o nome do vendedor: ").nextLine();
        String email = receberDados("Digite o email do vendedor:").nextLine();
        String cpf = receberDados("Digite o CPF do vendedor: ").nextLine();
        return ServicoVendedor.cadastrarVendedor(nome, email, cpf);
    }

    public static Venda cadastrarVenda()throws Exception{
        String cpfCliente = receberDados("Digite o CPF do cliente:").nextLine();
        String emailVendedor = receberDados("Digite o E-mail do vendedor responsável: ").nextLine();
        double valor = receberDados("Digite o valor da venda:").nextDouble();
        String data = receberDados("Digite a data data de recebimento da venda:").nextLine();
        return ServicoVenda.cadastrarVenda(cpfCliente, emailVendedor, valor, data);
    }

    public static List<Venda> pesquisarCompraPorCliente (){
        String cpf = receberDados("Digite o CPF do cliente que deseja pesquisar").nextLine();
        List<Venda> comprasDoCliente = ServicoVenda.pesquisarCompraPorCliente(cpf);
        return comprasDoCliente;
    }

    public static List<Venda> pesquisarVendaPorVendedor ()throws Exception{
        String email = receberDados("Digite o E-mail do vendedor que deseja pesquisar").nextLine();
        ServicoVendedor.verificarArrobaVendedor(email);
        List<Venda> vendasDoVendedor = ServicoVenda.pesquisarVendaPorVendedor(email);
        return vendasDoVendedor;
    }

    //public static boolean executar ()throws Exception{


}
