package Visitors;

import Elementos.Circulo;
import Elementos.Retangulo;
import Elementos.Trapezio;
import Elementos.Triangulo;

public interface Visitor {
    double visitarCirculo(Circulo c);
    double visitarRetangulo(Retangulo r);
    double visitarTrapezio(Trapezio tra);
    double visitarTriangulo(Triangulo tri);
}
