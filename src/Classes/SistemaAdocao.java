package Classes;

import java.util.ArrayList;

public class SistemaAdocao {
    private ArrayList<Voluntario> voluntarios;
    private ArrayList<Animal> animaisDisponiveis;
    private ArrayList<Animal> animaisAdotados;

    public SistemaAdocao() {
        this.voluntarios = new ArrayList<>();
        this.animaisDisponiveis = new ArrayList<>();
        this.animaisAdotados = new ArrayList<>();
    }

    public void cadastrarVoluntario(Voluntario voluntario) {
        voluntarios.add(voluntario);
    }

    public ArrayList<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(ArrayList<Voluntario> voluntarios) {
        this.voluntarios = voluntarios;
    }

    public ArrayList<Animal> getAnimaisDisponiveis() {
        return animaisDisponiveis;
    }

    public void adicionarAnimal(Animal animal) {
        this.animaisDisponiveis.add(animal);
    }

    public void setAnimaisDisponiveis(ArrayList<Animal> animaisDisponiveis) {
        this.animaisDisponiveis = animaisDisponiveis;
    }

    public ArrayList<Animal> getAnimaisAdotados() {
        return animaisAdotados;
    }

    public void setAnimaisAdotados(ArrayList<Animal> animaisAdotados) {
        this.animaisAdotados = animaisAdotados;
    }
}
