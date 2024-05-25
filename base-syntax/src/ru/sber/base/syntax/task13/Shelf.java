package ru.sber.base.syntax.task13;

public class Shelf {
    private static int cnt = 0;
    public void put() {
        cnt += 1;
        System.out.println("Продавец положил товар. Теперь на полке " + cnt + " товаров");
    }
    public void get() {
        cnt -= 1;
        System.out.println("Покупатель забрал товар. Теперь на полке " + cnt + " товаров");
    }

    public static int getCnt() {
        return cnt;
    }

    public String toString() {
        return String.valueOf(cnt);
    }
}
