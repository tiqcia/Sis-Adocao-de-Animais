package Classes;

public class Cachorro extends Animal {
    private String raca;
    private String cor;
    private String caracteristica;

    public Cachorro(int id, String nome, int idade, String sexo, String status, String raca, String cor, String caracteristica) {
        super(id, nome, idade, sexo, status);
        this.raca = raca;
        this.cor = cor;
        this.caracteristica = caracteristica;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public void emitirSom(){
        System.out.println("Au au!");
    }
}




