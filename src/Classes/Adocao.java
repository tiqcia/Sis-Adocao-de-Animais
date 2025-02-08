package Classes;

public class Adocao {
    private int id;
    private String dataAdocao;
    private animal animal;
    private Adotante adotante;

    public Adocao(int id, String dataAdocao, animal animal, Adotante adotante) {
        this.id = id;
        this.dataAdocao = dataAdocao;
        this.animal = animal;
        this.adotante = adotante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(String dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public animal getAnimal() {
        return animal;
    }

    public void setAnimal(animal animal) {
        this.animal = animal;
    }

    public pessoa getAdotante() {
        return adotante;
    }

    public void setAdotante(Adotante adotante) {
        this.adotante = adotante;
    }
}
