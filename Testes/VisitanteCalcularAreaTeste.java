package Testes;

import Elementos.Circulo;
import Elementos.Retangulo;
import Elementos.Trapezio;
import Elementos.Triangulo;
import Visitors.VisitanteCalcularArea;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class VisitanteCalcularAreaTeste {

    private static VisitanteCalcularArea visitante;
    private static Circulo circuloTeste;
    private static Retangulo retanguloTeste;
    private static Trapezio trapezioTeste;
    private static Triangulo trianguloTeste;

    @BeforeClass
    public static void setup() throws Exception {
        visitante = new VisitanteCalcularArea();
        circuloTeste = new Circulo(5);
        retanguloTeste = new Retangulo(4, 6);
        trapezioTeste = new Trapezio(3, 5, 7);
        trianguloTeste = new Triangulo(4, 8);
    }

    @Test
    public void testVisitarCirculo() {
        double result = visitante.visitarCirculo(circuloTeste);
        assertEquals(78.5, result, 0.01);
    }

    @Test
    public void testVisitarRetangulo() {
        double result = visitante.visitarRetangulo(retanguloTeste);
        assertEquals(24, result, 0.01);
    }

    @Test
    public void testeVisitarTrapezio() {
        double result = visitante.visitarTrapezio(trapezioTeste);
        assertEquals(28, result, 0.01);

    }

    @Test
    public void testeVisitarTriangulo() {
        double result = visitante.visitarTriangulo(trianguloTeste);
        assertEquals(16, result, 0.01);
    }
}
