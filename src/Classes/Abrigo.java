package Classes;

import java.util.ArrayList;

public class Abrigo {
    private String nome;
    private String endereco;
    private SistemaAdocao sistemaAdocao;

    public Abrigo(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.sistemaAdocao = new SistemaAdocao(); // Criando um sistema de adoção para o abrigo
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public SistemaAdocao getSistemaAdocao() {
        return sistemaAdocao;
    }

    public void setSistemaAdocao(SistemaAdocao sistemaAdocao) {
        this.sistemaAdocao = sistemaAdocao;
    }


    public ArrayList<Animal> getAnimaisDisponiveis() {
        return sistemaAdocao.getAnimaisDisponiveis();
    }

    public void adicionarAnimal(Animal animal) {
        sistemaAdocao.adicionarAnimal(animal);
    }
}
