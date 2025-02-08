package Classes;

public class Gato extends Animal {
    private String cor;
    private String caracteristica;

    public Gato(int id, String nome, int idade, String sexo, String status, String cor, String caracteristica) {
        super(id, nome, idade, sexo, status);
        this.cor = cor;
        this.caracteristica = caracteristica;
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
        System.out.println("Meooooow");
    }
}



