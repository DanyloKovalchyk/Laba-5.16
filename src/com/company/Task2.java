package com.company;

public class Task2 {
    public static void main(String[] args) {
        // катети
        int a = 3;
        int b = 4;
        System.out.println("Катети: "+ a +", "+ b);

        //квадрат катетів
        int a2 = a*a;
        int b2 = b*b;
        System.out.println("Квадрат катетів: "+ a2+", "+ b2);

        // гіпотенуза
        int c = a2 + b2;
        double sqrtC = Math.sqrt(c);
        System.out.println("Гіпотенуза трикутника = " +(int) sqrtC);

        // площа
        float d = 0.5f;
        float S = d*a*b;
        System.out.println("Площа трикутника = "+(int)S);

        // периметр
        int P = a+b+(int)sqrtC;
        System.out.println("Периметр трикутника = "+P);
    }
}