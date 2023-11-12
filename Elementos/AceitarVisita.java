package Elementos;

import Visitors.Visitor;

public interface AceitarVisita {
    double aceitarVisita(Visitor v);
    String getNome();
    void desenhar();
    void maximizar();
}
