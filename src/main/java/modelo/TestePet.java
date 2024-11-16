package modelo;

import modelo.Pet;
import modelo.Proprietario;
import modelo.Pessoa;
public class TestePet {

    public static void testaPetParaProprietario(){
        Proprietario proprietario = new Proprietario();
        proprietario.setNome("Giordana");
        proprietario.setEmail("giordana@ifam.edu.br");
        proprietario.setTelefone("92 91234-5678");


        // Criei o objeto
        Pet pet = new Pet();

        // Pet pet = new Pet("Bartolomeu","Giordana",2020,"Felina","SRD");

        // Setei os valores.
        pet.setNome("Bartolomeu");
        pet.setEspecie("Felina");
        pet.setRaca("SRD");
        pet.setAnoNascimento(2020);
        // Realizar a associação entre os objetos.
        pet.setProprietario(proprietario);

        // Mostrei os valores do Pet

        System.out.println("Nome:"+pet.getNome());
        System.out.println("Espécie:"+pet.getEspecie());
        System.out.println("Raça:"+pet.getRaca());
        System.out.println("Nascimento:"+pet.getAnoNascimento());
        System.out.println("Idade:"+pet.getIdade());

        // Mostrei os valores do proprietário do Pet.

//        Proprietario proprietarioSaida= pet.getProprietario();

        System.out.println("Proprietário - Nome:"+pet.getProprietario().getNome());
        System.out.println("Proprietário - Email:"+pet.getProprietario().getEmail());
        System.out.println("Proprietário - Telefone:"+pet.getProprietario().getTelefone());
    }

    public static void testaProprietarioParaPets(){

        Proprietario proprietario = new Proprietario();
        proprietario.setNome("Giordana");
        proprietario.setEmail("giordana@ifam.edu.br");
        proprietario.setTelefone("92 91234-5678");

//        proprietario.getPets()[0] = new Pet();
//        proprietario.getPets()[0].setNome("Bartolomeu");
//        proprietario.getPets()[0].setEspecie("Felina");
//        proprietario.getPets()[0].setRaca("SRD");
//        proprietario.getPets()[0].setAnoNascimento(2020);
//
//        proprietario.getPets()[1] = new Pet();
//        proprietario.getPets()[1].setNome("Belinha");
//        proprietario.getPets()[1].setEspecie("Felina");
//        proprietario.getPets()[1].setRaca("SRD");
//        proprietario.getPets()[1].setAnoNascimento(2018);

        //Mostrar proprietário

        Pet pet = new Pet();
        pet.setNome("Bruce");
        pet.setEspecie("Canina");
        pet.setRaca("Labrador");

       // proprietario.getPets().add(pet);

        System.out.println("Proprietario:"+proprietario.getNome());
        System.out.println("Proprietario:"+proprietario.getTelefone());
        System.out.println("Proprietario:"+proprietario.getEmail());

        System.out.println("Mostrando os pets ******");

//        for(Pet petaux : proprietario.getPets() ) {
//
//            System.out.println("Nome: "+petaux.getNome());
//            System.out.println("Espécie: "+petaux.getEspecie());
//            System.out.println("Raça: "+petaux.getRaca());
//        }

        // Realizar a associação entre os objetos.


    }

    public static void testaProprietarioParaPetsBidimensional(){
        Proprietario proprietario = new Proprietario();
        proprietario.setNome("Giordana");
        proprietario.setEmail("giordana@ifam.edu.br");
        proprietario.setTelefone("92 91234-5678");

        Pet pet = new Pet();
        pet.setNome("Bartolomeu");
        pet.setEspecie("Felina");
        pet.setRaca("SRD");
        pet.setAnoNascimento(2020);
        pet.setProprietario(proprietario);

        System.out.println("Nome:"+pet.getNome());
        System.out.println("Proprietário: "+pet.getProprietario().getNome());

        System.out.println("Mostrando os pets do proprietário:");

        proprietario.listarPets();
    }


    public static void main(String args[]){
        testaProprietarioParaPetsBidimensional();
    }

}
