package Elementos;

import Visitors.Visitor;

public class Circulo implements AceitarVisita {
    private double raio;
    private String nome = "Círculo";

    public Circulo(double raio) {
        this.raio = raio;
    }

    public String getNome() {
        return nome;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double aceitarVisita(Visitor v) {
        return v.visitarCirculo(this);
    }

    @Override
    public void desenhar() {
        System.out.println("\nDesenhando um circulo");
    }

    @Override
    public void maximizar() {
        System.out.println("\nRaio do círculo maximizado: " + 2 * raio);
    }

}
