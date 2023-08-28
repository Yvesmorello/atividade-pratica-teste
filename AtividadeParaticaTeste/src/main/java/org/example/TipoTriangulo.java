package org.example;

public class TipoTriangulo {

    private int ladoA;
    private int ladoB;
    private int ladoC;

    public TipoTriangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public String getTipoTriangulo() {

        if (ladoA == 0 || ladoB == 0 || ladoC == 0) {
            return "Inválido";
        }

        if (ladoA + ladoB <= ladoC || ladoA + ladoC <= ladoB || ladoB + ladoC <= ladoA) {
            return "Inválido";
        }

        if (ladoA == ladoB && ladoB == ladoC) {
            return "Equilátero";
        }
        else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            return "Isósceles";
        }
        else {
            return "Escaleno";
        }
    }
}