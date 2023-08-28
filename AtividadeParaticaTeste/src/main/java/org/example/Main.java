package org.example;

public class Main {
    public static void main(String[] args){

        Triangulo triangulo = new Triangulo(6,3);
        System.out.println(triangulo.calcularArea());

        TipoTriangulo tipoTriangulo = new TipoTriangulo(3,3,3);
        System.out.println(tipoTriangulo.getTipoTriangulo());

        TipoTriangulo tipoTriangulo1 = new TipoTriangulo(5,5,3);
        System.out.println(tipoTriangulo1.getTipoTriangulo());

        TipoTriangulo tipoTriangulo2 = new TipoTriangulo(4,2,3);
        System.out.println(tipoTriangulo2.getTipoTriangulo());
    }
}