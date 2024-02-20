package ru.sber.base.syntax.task2;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Решение квадратного уравнения");

        System.out.print("Введите a = ");
        float a = in.nextFloat();
        System.out.print("Введите b = ");
        float b = in.nextFloat();
        System.out.print("Введите c = ");
        float c = in.nextFloat();

        float d = (float) Math.pow(b, 2) - 4*a*c;
        float X, X1, X2;
        if (d > 0){
            X1 = (float) ((-b + Math.sqrt(d)) / (2*a));
            X2 = (float) ((-b - Math.sqrt(d)) / (2*a));
            System.out.println("X1 = " + X1);
            System.out.println("X2 = " + X2);
        } else if (d == 0){
            X = (-b)/(2*a);
            System.out.println("X = " + X);
        } else {System.out.println("Нет корней");}
    }
}
