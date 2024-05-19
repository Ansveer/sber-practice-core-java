package ru.sber.base.syntax.task6;

import java.util.Arrays;

public class Generics {
    public static void main(String[] args) {
        String[] months = new String[] {"Январь", "Февраль", "Март", "Апрель",
                "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь",
                "Ноябрь", "Декабрь",};
        int[] nums = new int[] {31, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18};
        Pair[] array1 = new Pair[months.length];
        for (int i = 0; i < months.length; i ++) {
            array1[i] = new Pair(months[i], nums[i]);
        }
        System.out.println(Arrays.toString(array1));

        int[] nums2 = new int[] {7, 1, 61, 43, 994, 355, 213, 374};
        String[] countries = new String[] {"Россия", "США", "Австралия", "Австрия", "Азербайджан",
                "Албания", "Алжир", "Армения"};
        Pair[] array2 = new Pair[countries.length];
        for (int i = 0; i < countries.length; i++) {
            array2[i] = new Pair(nums2[i], countries[i]);
        }
        System.out.println(Arrays.toString(array2));

    }
}
