package ru.sber.base.syntax.task4.pizzaorder;

public class PizzaOrderMain {
    public static void main(String[] args) {
        PizzaOrder pizzaOrder = new PizzaOrder("Пеперони", PizzaOrder.Size.BIG, true, "Ул.Сосновая 6");
        pizzaOrder.cancel();
        pizzaOrder.order();
        pizzaOrder.toString();
        pizzaOrder.cancel();
    }
}
