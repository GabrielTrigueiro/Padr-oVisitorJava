package Elementos;

import Visitors.Visitor;

public class Circulo implements AceitarVisita {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void aceitarVisita(Visitor v) {
        v.visitarCirculo(this);
    }

}
