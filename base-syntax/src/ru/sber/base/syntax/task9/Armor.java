package ru.sber.base.syntax.task9;

import java.io.Serializable;

public class Armor implements Serializable {
    String name = "железная";


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
