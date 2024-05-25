package ru.sber.base.syntax.task9;

import java.io.Serializable;

public class Weapon implements Serializable {
    String name = "меч";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
