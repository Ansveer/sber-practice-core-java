package ru.sber.base.syntax.task2;
import java.util.Scanner;
public class Task5 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Последовательность Фибоначчи");

        System.out.print("Введите количество чисел: ");
        int num = in.nextInt();

        if ((num >= 2) && (num <= 100)){
            int[] arr = new int[num];
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 2; i < arr.length; ++i) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }

            for (int i = 0; i < num; i++){
                System.out.print(arr[i]);
                System.out.print(' ');
            }
        } else {
            System.out.print("Введено недопустимое число " + num + ". Допустимый диапазон значений: 2 - 100");
        }
    }
}
