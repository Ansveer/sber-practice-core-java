package ru.sber.base.syntax.task2;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int num = in.nextInt();

        if ((num >= 1) && (num <= 500)){
            for (int i = 1; i < (num + 1); i++){
                System.out.print(7*i);
                System.out.print(' ');
            }
        } else {
            System.out.print("Введено недопустимое число " + num + ". Допустимый диапазон значений: 1 - 500");
        }
    }
}
