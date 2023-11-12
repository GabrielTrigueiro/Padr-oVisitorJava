package Visitors;

import Elementos.Circulo;
import Elementos.Retangulo;
import Elementos.Trapezio;
import Elementos.Triangulo;

public class VisitanteCalcularArea implements Visitor {

    @Override
    public double visitarCirculo(Circulo c) {
        double resultado = 2 * 3.14 + c.getRaio();
        System.out.println("Diametro do circulo: " + resultado);
        return resultado;
    }

    @Override
    public double visitarRetangulo(Retangulo r) {
        double resultado = r.getAltura() * r.getBase();
        System.out.println("Área do retangulo: " + resultado);
        return resultado;
    }

    @Override
    public double visitarTrapezio(Trapezio tra) {
        double resultado = ((tra.getBaseMaior() + tra.getBaseMenor()) * tra.getAltura()) / 2;
        System.out.println("Área do trapézio: " + resultado);
        return resultado;
    }

    @Override
    public double visitarTriangulo(Triangulo tri) {
        double resultado = (tri.getBase() * tri.getAltura()) / 2;
        System.out.println("Área do Triângulo: " + resultado);
        return resultado;
    }

}
