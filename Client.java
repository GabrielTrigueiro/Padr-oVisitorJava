import java.util.ArrayList;

import Elementos.AceitarVisita;
import Elementos.Circulo;
import Elementos.Retangulo;
import Elementos.Trapezio;
import Elementos.Triangulo;
import Visitors.VisitanteCalcularArea;
import Visitors.VisitanteDesenharFigura;
import Visitors.VisitanteMaximizar;
import Visitors.VisitantePerimetro;

public class Client {
    public static void main(String[] args) {
        ArrayList<AceitarVisita> figuras = new ArrayList<>();

        VisitanteCalcularArea area = new VisitanteCalcularArea();

        VisitantePerimetro perimetro = new VisitantePerimetro();

        VisitanteMaximizar maximizar = new VisitanteMaximizar();

        VisitanteDesenharFigura desenhar = new VisitanteDesenharFigura();

        figuras.add(new Circulo(5));
        figuras.add(new Retangulo(5, 4));
        figuras.add(new Triangulo(9, 8));
        figuras.add(new Trapezio(2, 5, 4));

        // calcular áreas
        for (AceitarVisita figura : figuras) {
            System.out.println("\nÁrea do " + figura.getNome() + " " + figura.aceitarVisita(area));
        }

        //desenhar figuras
        for (AceitarVisita figura : figuras) {
            figura.aceitarVisita(desenhar);
        }
        
        // calcular perimetros
        for (AceitarVisita figura : figuras) {
            System.out.println("\nPerimetro do " + figura.getNome() + " " + figura.aceitarVisita(perimetro));
        }

        // maximizar figuras
        for (AceitarVisita figura : figuras) {
            figura.aceitarVisita(maximizar);
        }

    }
}