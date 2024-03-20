package ru.sber.base.syntax.task4.circle;

public class Circle {
    public int radius;
    public String color;

    public double area() {
        return Math.PI * (radius * radius);
    }
    public double perimetr() {
        return 2 * Math.PI * radius;
    }
    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public String toString() {
        System.out.println(radius);
        System.out.println(color);
        System.out.println(area());
        System.out.println(perimetr());
        return "";
    }
}
