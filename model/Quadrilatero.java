package model;

import controller.IFiguraGeometrica;

public abstract class Quadrilatero implements IFiguraGeometrica {
    private float base;
    private float altura;

    public Quadrilatero(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public abstract float calcArea();

    @Override
    public float calcPerimetro() {
        return 2 * (base + altura);
    }

    // Getters e Setters
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}