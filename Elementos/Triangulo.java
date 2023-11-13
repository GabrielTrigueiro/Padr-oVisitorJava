package Elementos;

import Visitors.Visitor;

public class Triangulo implements AceitarVisita {
    private double base;
    private double altura;
    private String nome = "Triangulo";

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double aceitarVisita(Visitor v) {
        return v.visitarTriangulo(this);
    }

    @Override
    public void desenhar() {
        System.out.println("\nDesenhando um triângulo");
    }

}
