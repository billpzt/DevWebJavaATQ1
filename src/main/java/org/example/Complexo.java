package org.example;

public class Complexo {
    public Complexo() {
    }

    public static double soma(double n1, double n2){
        return n1 + n2;
    }

    public static double sub(double n1, double n2){
        return n1 - n2;
    }

    public static double modulus(double n1, double n2){
        return Math.pow(n1,2) + Math.pow(n2,2);
    }
}
