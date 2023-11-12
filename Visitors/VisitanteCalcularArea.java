package Visitors;

import Elementos.Circulo;
import Elementos.Retangulo;
import Elementos.Trapezio;
import Elementos.Triangulo;

public class VisitanteCalcularArea implements Visitor {

    @Override
    public double visitarCirculo(Circulo c) {
        double resultado = 2 * + c.getRaio();
        return resultado;
    }

    @Override
    public double visitarRetangulo(Retangulo r) {
        double resultado = r.getAltura() * r.getBase();
        return resultado;
    }

    @Override
    public double visitarTrapezio(Trapezio tra) {
        double resultado = ((tra.getBaseMaior() + tra.getBaseMenor()) * tra.getAltura()) / 2;
        return resultado;
    }

    @Override
    public double visitarTriangulo(Triangulo tri) {
        double resultado = (tri.getBase() * tri.getAltura()) / 2;
        return resultado;
    }

}
