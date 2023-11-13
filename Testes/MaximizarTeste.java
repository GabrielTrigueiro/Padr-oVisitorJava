package Testes;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import Elementos.Circulo;
import Elementos.Retangulo;
import Elementos.Trapezio;
import Elementos.Triangulo;
import Visitors.VisitanteMaximizar;

public class MaximizarTeste {

    private static VisitanteMaximizar visitante;
    private static Circulo circuloTeste;
    private static Retangulo retanguloTeste;
    private static Trapezio trapezioTeste;
    private static Triangulo trianguloTeste;

    @BeforeClass
    public static void setup() throws Exception {
        visitante = new VisitanteMaximizar();
        circuloTeste = new Circulo(5);
        retanguloTeste = new Retangulo(4, 6);
        trapezioTeste = new Trapezio(3, 6, 7);
        trianguloTeste = new Triangulo(4, 8);
    }

    @Test
    public void testeMaximizarTrapezio() {
        visitante.visitarTrapezio(trapezioTeste);
        assertEquals(6.0, trapezioTeste.getBaseMaior(), 0.01);
        assertEquals(6.0, trapezioTeste.getBaseMenor(), 0.01);
        assertEquals(6.0, trapezioTeste.getAltura(), 0.01);
    }

    @Test
    public void testeMaximizarTriangulo() {
        visitante.visitarTriangulo(trianguloTeste);
        assertEquals(8, trianguloTeste.getAltura(), 0.01);
        assertEquals(8, trianguloTeste.getBase(), 0.01);
    }

    @Test
    public void testeMaximizarCirculo() {
        visitante.visitarCirculo(circuloTeste);
        assertEquals(5, circuloTeste.getRaio(), 0.01);
    }

    @Test
    public void testeMaximizarRetangulo() {
        visitante.visitarRetangulo(retanguloTeste);
        assertEquals(6, retanguloTeste.getAltura(), 0.01);
        assertEquals(6, retanguloTeste.getBase(), 0.01);
    }
}
