package Testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Elementos.Circulo;
import Elementos.Retangulo;
import Elementos.Trapezio;
import Elementos.Triangulo;
import Visitors.VisitantePerimetro;

public class VisitantePerimetroTeste {

    private static VisitantePerimetro visitante;
    private static Circulo circulo;
    private static Retangulo retangulo;
    private static Trapezio trapezio;
    private static Triangulo triangulo;

    @BeforeClass
    public static void setup() throws Exception {
        visitante = new VisitantePerimetro();
        circulo = new Circulo(5);
        retangulo = new Retangulo(4, 6);
        trapezio = new Trapezio(3, 7, 5);
        triangulo = new Triangulo(4, 8);
    }

    @Test
    public void testVisitarCirculo() {
        double resultado = visitante.visitarCirculo(circulo);
        assertEquals(31.42, resultado, 0.05);
    }

    @Test
    public void testVisitarRetangulo() {
        double resultado = visitante.visitarRetangulo(retangulo);
        assertEquals(20, resultado, 0.05);
    }

    @Test
    public void testVisitarTrapezio() {
        double resultado = visitante.visitarTrapezio(trapezio);
        assertEquals(25, resultado, 1);
    }

    @Test
    public void testVisitarTriangulo() {
        double resultado = visitante.visitarTriangulo(triangulo);
        assertEquals(20, resultado, 1);
    }

}
