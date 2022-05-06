package com.company;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        //Числа які видаються програмою
        int a1 = (int) (Math.random() *3+1);
        int a2 = (int) (Math.random() *3+1);
        int a3 = (int) (Math.random() *3+1);

        Scanner r1 = new Scanner(System.in);
        Scanner r2 = new Scanner(System.in);
        Scanner r3 = new Scanner(System.in);
        Scanner r4 = new Scanner(System.in);
        Scanner r5 = new Scanner(System.in);
        Scanner r6 = new Scanner(System.in);

        System.out.println("Введіть три числа від 1 до 3");
        //Числа які вводить користувач
        int d1 = r1.nextInt();
        int d2 = r2.nextInt();
        int d3 = r3.nextInt();

        if (a1==d1 && a2==d2 && a3==d3) {
            System.out.println("Ви вгадали ");
        }
        else {
            System.out.println("Ви не вгадали, але у вас є ще одна спроба");
        }

        System.out.println("Введіть знову три числа від 1 до 3");
        //Друга спроба
        int d4 = r4.nextInt();
        int d5 = r5.nextInt();
        int d6 = r6.nextInt();

        if (a1==d4 && a2==d5 && a3==d6) {
            System.out.println("Ви вгадали ");
        }
        else {
            System.out.println("Ви не вгадали гру завершено");
        }

        System.out.println("Програма згенерувала такі числа");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}