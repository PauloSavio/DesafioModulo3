package br.com.zup;

import java.util.List;
import java.util.Scanner;

public class Sistema {

    //método para capturar dados
    private static Scanner receberDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //opções
    private static void chamarMenu() {
        System.out.println("\n---- Bem vinde ao sistema de cadastro de vendas ----");
        System.out.println("\t Escolha uma das opções a seguir:");
        System.out.println("\t Digite [1] para cadastrar cliente");
        System.out.println("\t Digite [2] para cadastrar vendedor");
        System.out.println("\t Digite [3] para cadastrar uma venda");
        System.out.println("\t Digite [4] para exibir clientes");
        System.out.println("\t Digite [5] para exibir vendedores");
        System.out.println("\t Digite [6] para exibir vendas");
        System.out.println("\t Digite [7] para exibir as compras de um cliente");
        System.out.println("\t Digite [8] para exibir as vendas de um vendedor");
        System.out.println("\t Digite [9] para sair do programa");
    }

    //pegar informações sobre cliente
    public static Cliente cadastrarCliente() throws Exception {
        String nome = receberDados("Digite o nome do cliente: ").nextLine();
        String email = receberDados("Digite o email do cliente:").nextLine();
        String cpf = receberDados("Digite o CPF do cliente: ").nextLine();
        return ServicoCliente.cadastrarCliente(nome, email, cpf);

    }

    //pegar informações sobre vendedor
    public static Vendedor cadastrarVendedor() throws Exception {
        String nome = receberDados("Digite o nome do vendedor: ").nextLine();
        String email = receberDados("Digite o email do vendedor:").nextLine();
        String cpf = receberDados("Digite o CPF do vendedor: ").nextLine();
        return ServicoVendedor.cadastrarVendedor(nome, email, cpf);
    }

    //pegar informações sobre venda
    public static Venda cadastrarVenda() throws Exception {
        String cpfCliente = receberDados("Digite o CPF do cliente:").nextLine();
        String emailVendedor = receberDados("Digite o E-mail do vendedor responsável: ").nextLine();
        double valor = receberDados("Digite o valor da venda:").nextDouble();
        String data = receberDados("Digite a data data de recebimento da venda:").nextLine();
        return ServicoVenda.cadastrarVenda(cpfCliente, emailVendedor, valor, data);
    }

    //pegar informações da compra
    public static List<Venda> pesquisarCompraPorCliente() {
        String cpf = receberDados("Digite o CPF do cliente que deseja pesquisar").nextLine();
        List<Venda> comprasDoCliente = ServicoVenda.pesquisarCompraPorCliente(cpf);
        return comprasDoCliente;
    }

    //pegar informações da venda
    public static List<Venda> pesquisarVendaPorVendedor() throws Exception {
        String email = receberDados("Digite o E-mail do vendedor que deseja pesquisar").nextLine();
        ServicoVendedor.verificarArrobaVendedor(email);
        List<Venda> vendasDoVendedor = ServicoVenda.pesquisarVendaPorVendedor(email);
        return vendasDoVendedor;
    }

    //juntar tudo
    public static boolean executar() throws Exception {
        boolean continuar = true;

        while (continuar) {
            chamarMenu();
            int escolhaMenu = receberDados("Digite sua escolha:").nextInt();

            if (escolhaMenu == 1) {
                cadastrarCliente();
                System.out.println("Cliente cadastrado com sucesso");
            } else if (escolhaMenu == 2) {
                cadastrarVendedor();
                System.out.println("Vendedor cadastrado com sucesso");
            } else if (escolhaMenu == 3) {
                cadastrarVenda();
                System.out.println("Venda cadastrado com sucesso");
            } else if (escolhaMenu == 4) {
                ServicoCliente.exibirClientes();
            } else if (escolhaMenu == 5) {
                ServicoVendedor.exibirVendedores();
            } else if (escolhaMenu == 6) {
                ServicoVenda.exibirVendas();
            } else if (escolhaMenu == 7) {
                System.out.println(pesquisarCompraPorCliente());
            } else if (escolhaMenu == 8) {
                System.out.println(pesquisarVendaPorVendedor());
            } else if (escolhaMenu == 9) {
                System.out.println("Obrigado e volte sempre.");
                continuar = false;
            } else {
                System.out.println("Opção inválida, selecione um número de 1 a 9");
            }
        }
        return continuar;
    }
}
