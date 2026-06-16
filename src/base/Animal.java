package base;

public abstract class Animal extends Coisa {
    public Animal(int x, int y, int idade, int saude) {
        super(x, y, idade, saude);
    }

    public void mover(int x, int y) {
        this.x += x;
        this.y += y;
    }
}

/*
 */

//
