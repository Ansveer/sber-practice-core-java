package ru.sber.base.syntax.task4.phone;

import java.util.Arrays;

public class Phone {
    public String number;
    public String model;
    public int weight;
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }
    public String getNumber() {
        return number;
    }
    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {}
    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " по номеру " + number);
    }
    public void sendMessages(String[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }
    public String toString() {
        System.out.println(number);
        System.out.println(model);
        System.out.println(weight);
        return "";
    }
}
