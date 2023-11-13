package Testes;
import Elementos.Circulo;
import Elementos.Retangulo;
import Elementos.Trapezio;
import Elementos.Triangulo;
import Visitors.VisitanteCalcularArea;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VisitanteCalcularAreaTeste {
    
    @Test
    public void testVisitarCirculo() {
        Circulo circuloTeste = new Circulo(5);
        VisitanteCalcularArea visitante = new VisitanteCalcularArea();
        double result = visitante.visitarCirculo(circuloTeste);
        assertEquals(78.5, result, 0.01);
    }

    @Test
    public void testVisitarRetangulo() {
        Retangulo retanguloTeste = new Retangulo(4, 6);
        VisitanteCalcularArea visitante = new VisitanteCalcularArea();
        double result = visitante.visitarRetangulo(retanguloTeste);
        assertEquals(24, result, 0.01);
    }

    @Test
    public void testeVisitarTrapezio() {
        Trapezio trapezioTeste = new Trapezio(3, 5, 7);
        VisitanteCalcularArea visitante = new VisitanteCalcularArea();
        double result = visitante.visitarTrapezio(trapezioTeste);
        assertEquals(28, result, 0.01);
        
    }

    @Test
    public void testeVisitarTriangulo() {
        Triangulo trianguloTeste = new Triangulo(4, 8);
        VisitanteCalcularArea visitante = new VisitanteCalcularArea();
        double result = visitante.visitarTriangulo(trianguloTeste);
        assertEquals(16, result, 0.01);
    }
}
