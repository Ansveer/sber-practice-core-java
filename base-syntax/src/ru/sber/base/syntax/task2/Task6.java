package ru.sber.base.syntax.task2;
public class Task6 {
    public static void main(String[] args){
        System.out.println("Случайные числа");

        int len = 100;
        int[] arr = new int[len];
        int a = 0;
        int b = 1000;
        for (int i = 0; i < len; i++){
            arr[i] = a + (int) (Math.random() * (b + 1));
        }

        System.out.println("Максимальное значение = " + max_num(arr, len) + " находится в элементе под индексом "
                        + arr_max_index(arr, max_num(arr, len), len));
        System.out.print("Среднее значение = " + average_value(arr, len));

    }
    static int max_num(int[] arr, int len){
        int max = 0;

        for (int i = 0; i < len; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int arr_max_index(int[] arr, int max, int len) {
        int index = 0;

        for (int i = 0; i < len; i++){
            if (max == arr[i]){
                index = i;
            }
        }
        return index;
    }

    static int average_value(int[] arr, int len){
        int sum = 0;

        for (int i = 0; i < len; i++){
            sum += arr[i];
        }
        return sum / len;
    }
}
