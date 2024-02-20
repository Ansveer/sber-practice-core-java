package ru.sber.base.syntax.task2;
import java.util.*;
public class Task9 {
//    A - 65, Z - 90
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Угадай букву");

        int a = 65;
        int b = 90;
        char c = (char) (Math.random()*(b - a) + a);
        System.out.println(c);
//        while (true){
//        }
    }
}
