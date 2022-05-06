package com.company;

public class Task3 {
    public static void main(String[] args) {

        int n = (int) (Math.random() * 101);
        System.out.println("Ваше число: " + n);

        int a = 0;
        int b = 0;
        int c = 0;
        int a1;
        int b1;
        int c1;

        a1 = n % 10;

        b1 = n % 100;
        b1 = b1/10;

        c1 = n%1000;
        c1 = c1/100;

        if (b1 == 0) {
            System.out.println("У вашому числі один символ "+ a1);
        }
        else if (c1 == 0){
            System.out.println("У вашому числі два символи "+b1 +" і "+ a1);
        }
        else
            System.out.println("У вашому числі три символа " + c1 +", "+ b1 +" і "+ a1);
    }
}