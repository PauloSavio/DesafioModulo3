package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {
    private static List<Cliente> clientes = new ArrayList<>();

    public static void verificarArrobaCliente(String email)throws Exception{
        if (!email.contains("@")){
            throw new Exception("E-mail inválido");
        }
    }

    public static void verificarEmailRepetidoCliente (String email) throws Exception{
        for (Cliente referencia: clientes){
            if (referencia.getEmail().equals(email)){
                throw new Exception("E-mail já cadastrado.");
            }
        }
    }

    public static void verificarCpfRepetidoCliente (String cpf)throws Exception{
        for (Cliente referencia: clientes){
            if (referencia.getCpf().equals(cpf)){
                throw new Exception("CPF já cadastrado.");
            }
        }
    }

    public static Cliente cadastrarCliente(String nome, String email, String cpf) throws Exception{
        verificarArrobaCliente(email);
        verificarEmailRepetidoCliente(email);
        verificarCpfRepetidoCliente(cpf);
        Cliente cliente = new Cliente(nome, email, cpf);
        clientes.add(cliente);
        return cliente;
    }

    public static Cliente pesquisarClientePorCpf(String cpf) throws Exception{
        for (Cliente referencia: clientes){
            if (referencia.getCpf().equals(cpf)){
                return referencia;
            }
        }
        throw new Exception("Cliente não cadastrado.");
    }



}

