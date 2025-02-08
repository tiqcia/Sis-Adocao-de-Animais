package Classes;

public class Adotante extends Pessoa {
    private boolean escolherAnimal;

    public Adotante(String cpf, String nome, int idade, String endereco, String telefone, boolean escolherAnimal) {
        super(cpf, nome, idade, endereco, telefone);

        this.escolherAnimal = escolherAnimal;
    }

    public boolean getEscolherAnimal() {
        return escolherAnimal;
    }

    public void setEscolherAnimal() {
        this.escolherAnimal = escolherAnimal;
    }
}