package Visitors;

import Elementos.Circulo;
import Elementos.Retangulo;
import Elementos.Trapezio;
import Elementos.Triangulo;

public class VisitantePerimetro implements Visitor {
    public double calcularLadoInclinado(double baseMenor, double baseMaior, double altura) {
        double termo1 = Math.pow(altura, 2);
        double termo2 = Math.pow((baseMaior - baseMenor) / 2, 2);
        return Math.sqrt(termo1 + termo2);
    }

    public double calcularLadoRestante(double base, double altura) {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    @Override
    public double visitarCirculo(Circulo c) {
        return c.getRaio() * 2 * 3.14;
    }

    @Override
    public double visitarRetangulo(Retangulo r) {
        return (r.getAltura() + r.getBase()) * 2;
    }

    @Override
    public double visitarTrapezio(Trapezio tra) {
        double lados = 2 * (calcularLadoInclinado(tra.getBaseMenor(), tra.getBaseMaior(), tra.getAltura()));
        return tra.getAltura() + tra.getBaseMaior() + tra.getBaseMenor() + lados;
    }

    @Override
    public double visitarTriangulo(Triangulo tri) {
        double ladoRestante = calcularLadoRestante(tri.getBase(), tri.getAltura());
        return tri.getAltura() + tri.getBase() + ladoRestante;
    }
}
