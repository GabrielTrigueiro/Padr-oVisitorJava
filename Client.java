import java.util.ArrayList;

import Elementos.AceitarVisita;
import Elementos.Circulo;
import Elementos.Retangulo;
import Elementos.Trapezio;
import Elementos.Triangulo;
import Visitors.VisitanteCalcularArea;

public class Client {
    public static void main(String[] args) {
        ArrayList<AceitarVisita> figuras = new ArrayList<>();

        VisitanteCalcularArea calculadora = new VisitanteCalcularArea();

        figuras.add(new Circulo(2.3));
        figuras.add(new Retangulo(2, 4));
        figuras.add(new Triangulo(2, 3));
        figuras.add(new Trapezio(2, 3, 4));

        for (AceitarVisita figura : figuras) {
            System.out.println("Área do " + figura.getNome() + " " + figura.aceitarVisita(calculadora));
        }
    }
}