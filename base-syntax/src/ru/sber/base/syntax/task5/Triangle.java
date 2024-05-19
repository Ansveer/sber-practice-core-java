package ru.sber.base.syntax.task5;

public class Triangle extends Figure implements Drawable{
    public void draw() {
        System.out.println("Нарисован прямоугольник с координатами" + point);
    }
    public void draw(Color color) {
        System.out.println("Нарисован прямоугольник с цветом " + color + " и координатами " + point);
    }
}
