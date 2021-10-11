package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {
    private static List<Vendedor> vendedores = new ArrayList<>();

    public static void verificarArrobaVendedor(String email)throws Exception{
        if (!email.contains("@")){
            throw new Exception("E-mail inválido");
        }
    }

    public static void verificarEmailRepetidoVendedor (String email) throws Exception{
        for (Vendedor referencia: vendedores){
            if (referencia.getEmail().equals(email)){
                throw new Exception("Esse E-mail já está cadastrado.");
            }
        }
    }

    public static void verificarCpfRepetidoVendedor (String cpf) throws Exception{
        for (Vendedor referencia: vendedores){
            if (referencia.getCpf().equals(cpf)){
                throw new Exception("Esse CPF já está cadastrado.");
            }
        }
    }

    public static Vendedor cadastrarVendedor(String nome, String email, String cpf)throws Exception{
        verificarArrobaVendedor(email);
        verificarEmailRepetidoVendedor(email);
        verificarCpfRepetidoVendedor(cpf);
        //tentar estourar exception assim que o email for colocado
        Vendedor vendedor = new Vendedor(nome, email, cpf);
        vendedores.add(vendedor);
        return vendedor;
    }

    public static Vendedor pesquisarVendedorPorEmail(String email) throws Exception{
        for (Vendedor referencia: vendedores){
            if (referencia.getEmail().equals(email)){
                return referencia;
            }
        }
        throw new Exception("Vendedor não cadastrado.");
    }

    public static void exibirVendedores(){
        for (Vendedor referencia: vendedores) {
            System.out.println(referencia);
        }
    }
}
