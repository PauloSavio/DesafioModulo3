package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {
    private static List<Cliente> clientes = new ArrayList<>();

    public static Cliente cadastrarCliente(String nome, String email, String cpf) {
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

