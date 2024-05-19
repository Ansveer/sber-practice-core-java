package ru.sber.base.syntax.task5;

public class Square extends Rectangle implements Drawable{
    public void draw() {
        System.out.println("Нарисован квадрат с координатами" + point);
    }
    public void draw(Color color) {
        System.out.println("Нарисован квадрат с цветом " + color + " и координатами " + point);
    }
}
