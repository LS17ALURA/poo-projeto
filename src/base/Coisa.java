package base;

public class Coisa {
    protected int x;
    protected int y;

    private int idade;
    private int saude;

    public Coisa(int x, int y, int idade, int saude) {
        this.x = x;
        this.y = y;
        this.idade = idade;
        this.saude = saude;
    }

    public void envelhecer() {
        this.idade++;
        this.saude--;
    }

    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }

    public int getIdade() {
        return idade;
    }

    public int getSaude() {
        return saude;
    }



    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void setSaude(int saude) {
        this.saude = saude;
    }

    public void setPosicao(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
