package teste;

import modelo.EntidadeEnviaEmails;
import modelo.EntidadeEnviaSMS;
import main.java.modelo.Fornecedor;
import modelo.Funcionario;

public class TesteEnviarEmails {

//  private static void  enviarEmail(Funcionario funcionario){
//      System.out.println("Destinatário: "+funcionario.getEmail());
//      System.out.println("Caro, "+funcionario.getNome());
//      System.out.println("Obrigado por sua colaboração em nossa empresa!");
//    }

//  private static void enviarEmail(Fornecedor fornecedor){
//      System.out.println("Destinatário: "+fornecedor.getEmail());
//      System.out.println("Prezado, "+fornecedor.getNome());
//      System.out.println("Com intuito de ter os melhores preços gostaríamos de negociar com a empresa");
//  }

  private static void enviarEmail(EntidadeEnviaEmails entidadeEnviarEmail){

      System.out.println(entidadeEnviarEmail.prepararConteudoEmail());

  }

    private static void enviarSMS(EntidadeEnviaSMS entidadeEnviarSMS){

        System.out.println(entidadeEnviarSMS.prepararConteudoSMS());

    }
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Funcionário 1 ",
                "3245-6945",
                "funcionario@gmail.com",
                "25-10-2024",
                "1234567");

        //System.out.println(funcionario);

        //System.out.println("*********************************");

        Fornecedor fornecedor = new Fornecedor("Fornecedor 1",
                "1246-9873",
                "fornecedor@gmail.com",
                "12497863");

        //System.out.println(fornecedor);

        enviarEmail(funcionario);
        enviarSMS(funcionario);
        System.out.println("*********************************");
        enviarEmail(fornecedor);
        //enviarSMS(funcionario);
    }
}
