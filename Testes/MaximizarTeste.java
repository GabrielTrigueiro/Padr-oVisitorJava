package Testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Elementos.Retangulo;
import Elementos.Trapezio;
import Elementos.Triangulo;

public class MaximizarTeste {

    @Test
    public void testeMaximizarTrapezio(){
        Trapezio trapezio = new Trapezio(4, 6, 5);
        trapezio.maximizar();

        assertEquals(6.0, trapezio.getBaseMaior(), 0.01);
        assertEquals(6.0, trapezio.getBaseMenor(), 0.01);
        assertEquals(6.0, trapezio.getAltura(), 0.01);
    }

    @Test
    public void testeMaximizarTriangulo(){
        Triangulo triangulo = new Triangulo(5, 8);
        triangulo.maximizar();

        assertEquals(8, triangulo.getAltura(), 0.01);
        assertEquals(8, triangulo.getBase(), 0.01);
    }

    @Test
    public void testeMaximizarRetangulo(){
        Retangulo retangulo = new Retangulo(7, 4);
        retangulo.maximizar();

        assertEquals(7, retangulo.getAltura(), 0.01);
        assertEquals(7, retangulo.getBase(), 0.01);
    }
}



