package model;

public class Paralelogramo extends Quadrilatero {
    public Paralelogramo(float base, float altura) {
        super(base, altura);
    }

    public float calcArea() {
        return getBase() * getAltura();
    }
}