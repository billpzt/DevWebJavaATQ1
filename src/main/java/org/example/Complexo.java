package org.example;

public class Complexo {
    public Complexo() {
    }

    public static double soma(double n1, double n2){
        double resultado = n1 + n2;
        return resultado;
    }

    public static double sub(double n1, double n2){
        double resultado = n1 - n2;
        return resultado;
    }

    public static double modulus(double n1, double n2){
        double  resultado = Math.pow(n1,2) + Math.pow(n2,2);
        return resultado;
    }
}
