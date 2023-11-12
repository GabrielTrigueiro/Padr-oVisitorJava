import java.util.ArrayList;

import Elementos.AceitarVisita;
import Elementos.Circulo;
import Elementos.Retangulo;
import Elementos.Trapezio;
import Elementos.Triangulo;
import Visitors.VisitanteCalcularArea;
import Visitors.VisitantePerimetro;

public class Client {
    public static void main(String[] args) {
        ArrayList<AceitarVisita> figuras = new ArrayList<>();

        VisitanteCalcularArea area = new VisitanteCalcularArea();

        VisitantePerimetro perimetro = new VisitantePerimetro();

        figuras.add(new Circulo(2.3));
        figuras.add(new Retangulo(2, 4));
        figuras.add(new Triangulo(2, 3));
        figuras.add(new Trapezio(2, 3, 4));

        // calcular áreas
        for (AceitarVisita figura : figuras) {
            System.out.println("Área do " + figura.getNome() + " " + figura.aceitarVisita(area));
        }

        // calcular perimetros
        for (AceitarVisita figura : figuras) {
            System.out.println("Perimetro do " + figura.getNome() + " " + figura.aceitarVisita(perimetro));
        }
    }
}