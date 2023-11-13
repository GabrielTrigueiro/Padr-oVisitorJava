package Visitors;

import Elementos.Circulo;
import Elementos.Retangulo;
import Elementos.Trapezio;
import Elementos.Triangulo;

public class VisitanteDesenharFigura implements Visitor {

    @Override
    public double visitarCirculo(Circulo c) {
        System.out.println("\nDesenhando um círculo com raio " + c.getRaio());
        return 1;
    }

    @Override
    public double visitarRetangulo(Retangulo r) {
        System.out.println("\nDesenhando um retângulo com base " + r.getBase() + " e altura " + r.getAltura());
        return 1;
    }

    @Override
    public double visitarTrapezio(Trapezio tra) {
        System.out.println("\nDesenhando um retângulo com base maior " + tra.getBaseMaior() + " e base menor " + tra.getBaseMenor() + " com altura " + tra.getAltura());
        return 1;
    }

    @Override
    public double visitarTriangulo(Triangulo tri) {
        System.out.println("\nDesenhando um retângulo com base " + tri.getBase() + " e altura " + tri.getAltura());
        return 1;
    }

}
