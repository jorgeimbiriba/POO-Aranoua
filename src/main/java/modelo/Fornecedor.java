package main.java.modelo;

public class Fornecedor extends Pessoa implements EntidadeEnviaEmails {

    public Fornecedor() {
    }

    public Fornecedor(String nome, String telefone, String email, String documento) {
        super(nome, telefone, email, documento);
        //super = construtor da superclasse
    }

    public boolean validarDocumento() {
        //Valida o documento de acordo com a comparação
            if (this.getDocumento().toCharArray()[0] == '1') {
                return true;
            }
            return false;
    }

    public String toString() {
        String dados = "Nome:"+nome+
                "\nTelefone:"+telefone+
                "\nEmail:"+email+
                "\nDocumento:"+documento;
        return dados;
    }

    @Override
    public String prepararConteudoEmail() {
        String dados = "Destinatário: "+this.getEmail() +
                       "\nPrezado, "+this.getNome() +
                        "\nCom intuito de ter os melhores preços gostaríamos de negociar com a empresa";
        return dados;
    }
}
