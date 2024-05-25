package ru.sber.base.syntax.task9;

import java.io.Serializable;

public class Hero implements Serializable {
    String name = "test";
    int lvl = 1;
    Weapon weapon = new Weapon();
    Armor armor = new Armor();
    public Hero() {

    }

    public Hero(String name, int lvl, Weapon weapon, Armor armor) {
        this.name = name;
        this.lvl = lvl;
        this.weapon = weapon;
        this.armor = armor;
    }

    public String toString() {
        return name + ", " + lvl + " уровня, оружие: " + weapon.getName() + ", броня: " + armor.getName();
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
    public int getLvl() {
        return lvl;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public Weapon getWeapon() {
        return weapon;
    }
    public void setArmor(Armor armor) {
        this.armor = armor;
    }
    public Armor getArmor() {
        return armor;
    }
}
