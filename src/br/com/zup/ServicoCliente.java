package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {
    private static List<Cliente> clientes = new ArrayList<>();

    //verificar email válido
    public static void verificarArrobaCliente(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("E-mail inválido");
        }
    }

    //email repetido
    public static void verificarEmailRepetidoCliente(String email) throws Exception {
        for (Cliente referencia : clientes) {
            if (referencia.getEmail().equals(email)) {
                throw new Exception("Esse E-mail já está cadastrado.");
            }
        }
    }

    //cpf repetido
    public static void verificarCpfRepetidoCliente(String cpf) throws Exception {
        for (Cliente referencia : clientes) {
            if (referencia.getCpf().equals(cpf)) {
                throw new Exception("Esse CPF já está cadastrado.");
            }
        }
    }

    //jogar cliente na lista
    public static Cliente cadastrarCliente(String nome, String email, String cpf) throws Exception {
        verificarArrobaCliente(email);
        verificarEmailRepetidoCliente(email);
        verificarCpfRepetidoCliente(cpf);
        Cliente cliente = new Cliente(nome, email, cpf);
        clientes.add(cliente);
        return cliente;
    }

    //pesquisa por cpf
    public static Cliente pesquisarClientePorCpf(String cpf) throws Exception {
        for (Cliente referencia : clientes) {
            if (referencia.getCpf().equals(cpf)) {
                return referencia;
            }
        }
        throw new Exception("Cliente não cadastrado.");
    }

    //método de exibição
    public static void exibirClientes() {
        for (Cliente referencia : clientes) {
            System.out.println(referencia);
        }
    }
}

