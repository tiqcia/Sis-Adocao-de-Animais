package Classes;

public class Voluntario extends Pessoa {

    private int codigoID;
    private String funcao;

    public Voluntario(String cpf, String nome, int idade, String endereco, String telefone, int codigoID, String funcao) {
        super(cpf, nome, idade, endereco, telefone);
        this.codigoID = codigoID;
        this.funcao = funcao;

    }

    public int getCodigoID() {
        return codigoID;
    }

    public void setCodigoID(int codigoID) {
        this.codigoID = codigoID;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
