package Visitors;

import Elementos.Circulo;
import Elementos.Retangulo;
import Elementos.Trapezio;
import Elementos.Triangulo;

public class VisitanteMaximizar implements Visitor {

    @Override
    public double visitarCirculo(Circulo c) {
        System.out.println("\nRaio do círculo maximizado: " + c.getRaio());
        return c.getRaio();
    }

    @Override
    public double visitarRetangulo(Retangulo r) {
        double maiorLado = Math.max(r.getBase(), r.getAltura());
        System.out.println("\nRetângulo maximizado: " + "\nBase: " + maiorLado + "\nAltura: " + maiorLado);
        r.setBase(maiorLado);
        r.setAltura(maiorLado);
        return maiorLado;
    }

    @Override
    public double visitarTrapezio(Trapezio tra) {
        double maiorLado = Math.max(tra.getBaseMenor(), tra.getBaseMaior());
        System.out.println("\nTrapézio maximizado: " + "\nBaseMenor: " + maiorLado + "\nBaseMaior: " + maiorLado
                + "\nAltura: " + maiorLado);
        tra.setAltura(maiorLado);
        tra.setBaseMaior(maiorLado);
        tra.setBaseMenor(maiorLado);
        return maiorLado;
    }

    @Override
    public double visitarTriangulo(Triangulo tri) {
        double maiorLado = Math.max(tri.getBase(), tri.getAltura());
        System.out.println("\nTriângulo maximizado: " + "\nBase: " + maiorLado + "\nAltura: " + maiorLado);
        tri.setAltura(maiorLado);
        tri.setBase(maiorLado);
        return maiorLado;
    }

}
