package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {
    private static List<Vendedor> vendedores = new ArrayList<>();

    public static Vendedor cadastrarVendedor(String nome, String email, String cpf){
        Vendedor vendedor = new Vendedor(nome, email, cpf);
        vendedores.add(vendedor);
        return vendedor;
    }

    public static Vendedor pesquisarVendedorPorEmail(String email){
        for (Vendedor referencia: vendedores){
            if (referencia.getEmail().equals(email)){
                return referencia
            }
        }
    }
}
