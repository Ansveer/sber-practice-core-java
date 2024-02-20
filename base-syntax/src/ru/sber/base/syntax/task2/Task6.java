package ru.sber.base.syntax.task2;
public class Task6 {
    public static void main(String[] args){
        System.out.println("Случайные числа");

        int[] arr = new int[100];
        int a = 0;
        int b = 1000;
        for (int i = 0; i < 100; i++){
            arr[i] = a + (int) (Math.random() * b);
        }

        System.out.println("Максимальное значение = " + max_num(arr) + " находится в элементе под индексом "
                        + arr_max_index(arr, max_num(arr)));
        System.out.print("Среднее значение = " + average_value(arr));

    }
    static int max_num(int[] arr){
        int max = 0;

        for (int i = 0; i < 100; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int arr_max_index(int[] arr, int max) {
        int index = 0;

        for (int i = 0; i < 100; i++){
            if (max == arr[i]){
                index = i;
            }
        }
        return index;
    }

    static int average_value(int[] arr){
        int sum = 0;

        for (int i = 0; i < 100; i++){
            sum += arr[i];
        }
        return sum / 100;
    }
}
