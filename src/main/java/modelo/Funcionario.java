package modelo;

public class Funcionario extends Pessoa implements EntidadeEnviaEmails,EntidadeEnviaSMS {

    private String dataAdmissao;


    public Funcionario() {
    }

    public Funcionario(String nome, String telefone, String email, String dataAdmissao,String documento) {
        super(nome, telefone, email,documento);
        this.dataAdmissao = dataAdmissao;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public boolean validarDocumento() {
        //cnpj: fornecedor
        //Compara a string
        //Valida o documento de acordo com a comparação
            if (this.getDocumento().toCharArray()[0] == '1') {
                return true;
            }
            return false;
        }


    public String toString(){
       String dados =
       "\nCarteira de Trabalho:"+this.validarDocumento()+
        "\nData de Admissão:"+this.getDataAdmissao();

       dados = super.toString() + dados;
        return dados;
    }

    @Override
    public String prepararConteudoEmail() {
            String dados = "\nDestinatário: "+this.getEmail()+
                           "\nCaro, "+this.getNome()+
                            "Obrigado por sua colaboração em nossa empresa!";

        return dados;
    }

    public String prepararConteudoSMS() {
        String dados = "\nDestinatário: "+this.getTelefone()+
                "\nCaro, "+this.getNome()+
                "Obrigado por sua colaboração em nossa empresa!";

        return dados;
    }
}
