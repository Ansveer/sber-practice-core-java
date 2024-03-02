package ru.sber.base.syntax.task2;
import java.util.Scanner;
public class Task4 {

    static boolean prime(int n){
        for (int i=2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Проверка числа на простоту.");

        System.out.print("Введите натуральное целое число: ");
        int num = in.nextInt();

        if ((num > 1) && (prime(num))) {
            System.out.print("Да");
        } else {
            System.out.print("Нет");
        }
    }
}
