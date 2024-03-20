package ru.sber.base.syntax.task4.circle;

import ru.sber.base.syntax.task4.circle.Circle;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Black");
        System.out.println(circle.area());
        System.out.println(circle.perimetr());
        circle.toString();
        circle.radius = 6;
        circle.color = "White";
        circle.toString();
    }
}
