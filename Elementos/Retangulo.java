package Elementos;

import Visitors.Visitor;

public class Retangulo implements AceitarVisita {
    private double base;
    private double altura;
    private String nome = "Retângulo";

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double aceitarVisita(Visitor v) {
        return v.visitarRetangulo(this);
    }

    @Override
    public void desenhar() {
        System.out.println("\nDesenhando um retângulo");
    }

}
