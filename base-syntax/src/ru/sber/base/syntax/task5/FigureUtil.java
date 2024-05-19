package ru.sber.base.syntax.task5;

public class FigureUtil {
    private FigureUtil() {
    }
    public static void area(Figure figure) {
        figure.area();
    }
    public static void perimeter(Figure figure) {
        figure.perimeter();
    }
    public static void draw(Drawable figure) {
        figure.draw(Color.BLACK);
    }
    public static void draw(Drawable figure, Color color) {
        figure.draw(color);
    }
}
