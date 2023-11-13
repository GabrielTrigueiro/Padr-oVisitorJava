package Elementos;

import Visitors.Visitor;

public class Trapezio implements AceitarVisita {
    private double baseMenor;
    private double baseMaior;
    private double altura;
    private String nome = "Trapézio";

    public Trapezio(double baseMenor, double baseMaior, double altura) {
        this.baseMenor = baseMenor;
        this.baseMaior = baseMaior;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double aceitarVisita(Visitor v) {
        return v.visitarTrapezio(this);
    }

    @Override
    public void desenhar() {
        System.out.println("\nDesenhando um trapézio");
    }

}
