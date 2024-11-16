package teste;

import main.java.modelo.Fornecedor;
import modelo.Funcionario;

public class TestaToString {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Funcionário 1 ",
                "3245-6945",
                "funcionario@gmail.com",
                "25-10-2024",
                "1234567");

        System.out.println(funcionario);

        System.out.println("*********************************");

        Fornecedor fornecedor = new Fornecedor("Fornecedor 1",
                "1246-9873",
                "fornecedor@gmail.com",
                "12497863");

        System.out.println(fornecedor);
    }
}
