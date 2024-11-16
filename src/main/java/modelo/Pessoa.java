package modelo;

public abstract class Pessoa {

    //Funcionou apenas com as variáveis protected
    protected String nome;
    protected String telefone;
    protected String email;
    protected String documento;

    public abstract boolean validarDocumento();


    //Métodos ou elementos com o mesmo nome - cabeçalho e argumentos diferentes - ocorre dentro da mesma classe == Sobrecarga
    //Havendo herança, os métodos podem ser reaproveitados usando o extends
    //Métod o abstrato == sem implementação
    public Pessoa() {
    }

    public Pessoa(String nome, String telefone, String email, String documento) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        String dados = "Nome: " + nome +
                ", Telefone: " + telefone +
                ", Email= " + email +
                ", Documento:" + documento;
        return dados;
    }
}
