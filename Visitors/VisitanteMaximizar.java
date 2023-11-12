package Visitors;

import Elementos.Circulo;
import Elementos.Retangulo;
import Elementos.Trapezio;
import Elementos.Triangulo;

public class VisitanteMaximizar implements Visitor {

    @Override
    public double visitarCirculo(Circulo c) {
        c.maximizar();
        return 1;
    }

    @Override
    public double visitarRetangulo(Retangulo r) {
        r.maximizar();
        return 1;
    }

    @Override
    public double visitarTrapezio(Trapezio tra) {
        tra.maximizar();
        return 1;
    }

    @Override
    public double visitarTriangulo(Triangulo tri) {
        tri.maximizar();
        return 1;
    }

}
