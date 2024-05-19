package ru.sber.base.syntax.task5;

public class Circle extends Figure implements Drawable{
    public void draw() {
        System.out.println("Нарисован круг с координатами" + point);
    }
    public void draw(Color color) {
        System.out.println("Нарисован круг с цветом " + color + " и координатами " + point);
    }

}
