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

        while (true){
            System.out.print("Введите букву: ");
            String d = in.next().toUpperCase();
            char answer = d.charAt(0);
            if ((answer > 'Z') | (answer < 'A')){
                System.out.println("Введён недопустимый символ");
                continue;
            }

            if (answer > c) {
                System.out.println("Ищи букву, которая перед ней в алфавите");
            } else if (answer < c) {
                System.out.println("Ищи букву, которая после неё в алфавите");
            } else {
                System.out.println("Верно!");
                break;
            }
        }
    }
}
