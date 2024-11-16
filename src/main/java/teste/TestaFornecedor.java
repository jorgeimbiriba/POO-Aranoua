package teste;

import main.java.modelo.Fornecedor;

public class TestaFornecedor {

    public static void main(String[] args) {

        Fornecedor fornecedor = new Fornecedor();

        fornecedor.setNome("PetSuply");
        fornecedor.setTelefone("011 2345-6789");
        fornecedor.setEmail("contato@petsuply.com.br");
        fornecedor.setDocumento("16.889.532/0001-54");

        System.out.println(fornecedor.getNome());
        System.out.println(fornecedor.getTelefone());
        System.out.println(fornecedor.getEmail());
        System.out.println(fornecedor.getDocumento());
        System.out.println("Documento Validado:"+fornecedor.validarDocumento());

    }
}
