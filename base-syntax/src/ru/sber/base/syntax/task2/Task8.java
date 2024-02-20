package ru.sber.base.syntax.task2;
import java.util.*;
public class Task8 {
    public static void main(String[] args) {
        System.out.println("Сортировка методом пузырька");

        int len = 30;
        int[] arr = new int[len];
        int a = 0;
        int b = 1000;
        for (int i = 0; i < len; i++){
            arr[i] = a + (int) (Math.random() * b);
        }
        System.out.println(Arrays.toString(arr));

        int tmp;
        for (int i = 1; i < len; i++){
            for (int j = len - 1; j >= i; j--){
                if (arr[j] < arr[j - 1]){
                    tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
