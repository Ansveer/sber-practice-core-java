package ru.sber.base.syntax.task4.pizzaorder;

public class PizzaOrder {
    public String name;
    public enum Size {
        SMALL,
        MEDIUM,
        BIG
    }
    public Size pizzaSize;
    public String getSize(){
        switch (pizzaSize){
            case BIG: return "Большая";
            case MEDIUM: return "Средняя";
            case SMALL: return "Маленькая";
            default: return "";
        }
    }
    public boolean sauce;
    public String address;
    public boolean orderIsTaken;
    public PizzaOrder(String name, Size size, boolean sauce, String address) {
        this.name = name;
        this.pizzaSize = size;
        this.sauce = sauce;
        this.address = address;
    }
    public void order() {
        if (orderIsTaken) {
            System.out.println("Заказ уже принят");
        }
        else {
            if (sauce) {
                System.out.println("Заказ принят. " + getSize() + " пицца " + name +
                    " с соусом на адрес " + address);
            }
            else {
                System.out.println("Заказ принят. " + getSize() + " пицца " + name +
                        " без соуса на адрес " + address);
            }
            orderIsTaken = true;
        }
    }
    public void cancel() {
        if (orderIsTaken) {
            System.out.println("Заказ отменён");
            orderIsTaken = false;
        }
        else {
            System.out.println("Заказ не был принят");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(Size pizzaSize) {
        this.pizzaSize = pizzaSize;
    }
    public boolean getSauce() {
        return sauce;
    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        System.out.println(name);
        System.out.println(getSize());
        System.out.println(sauce);
        System.out.println(address);
        return "";
    }
}
