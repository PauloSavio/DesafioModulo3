package br.com.zup;

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
        System.out.println("\n Digite [4] para exibir todes clientes");
        System.out.println("\n Digite [5] para exibir todes vendedores");
        System.out.println("\n Digite [6] para exibir todas as vendas");
    }
}
