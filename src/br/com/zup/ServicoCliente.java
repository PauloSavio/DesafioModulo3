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
    //verificar email repetido
    //verificar cpf repetido

    public static Cliente cadastrarCliente(String nome, String email, String cpf) throws Exception{
        verificarArrobaCliente(email);
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

