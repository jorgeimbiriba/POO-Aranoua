package teste;

import main.java.modelo.Fornecedor;
import modelo.Funcionario;
import modelo.Pessoa;

import java.util.ArrayList;

public class TestaValidacaoDocumentos {

    public static void validarDocumentacao(ArrayList<Pessoa> pessoas){
        int qtdeValidados = 0;
        for(Pessoa p:pessoas){
            System.out.println(p.getNome()+"-"+p.getDocumento()+"-"+"- Validado:"+p.validarDocumento());
            if(p.validarDocumento()) { //if (classe ==  "Funcionario"){ Polimorfismo por ligação ou acoplamento dinâmico (Dynamic Byind
                qtdeValidados++;       //Funcionario.validarDocumento();}
            }                          //else if (classe == "Fornecedor){
                                       //Fornecedor.validarDocumento();}
        }
        System.out.println("Total de Validados:"+qtdeValidados);
    }

    public static void main(String[] args) {

        ArrayList<Pessoa> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Funcionario01","32345-0001","funcionario01@email.com","21-01-2024","22345"));
        funcionarios.add(new Funcionario("Funcionario02","32345-0002","funcionario01@email.com","21-01-2024","22345"));
        funcionarios.add(new Funcionario("Funcionario03","32345-0003","funcionario01@email.com","21-01-2024","12345"));

        validarDocumentacao(funcionarios);

        ArrayList<Pessoa> fornecedores = new ArrayList<>();

        fornecedores.add(new Fornecedor("Fornecedor01","3234-5678","fornecedor01@email.com","12345"));
        fornecedores.add(new Fornecedor("Fornecedor02","3234-5678","fornecedor01@email.com","02345"));
        fornecedores.add(new Fornecedor("Fornecedor03","3234-5678","fornecedor01@email.com","5345"));
        fornecedores.add(new Fornecedor("Fornecedor04","3234-5678","fornecedor01@email.com","12345"));

        validarDocumentacao(fornecedores);

    }
}
