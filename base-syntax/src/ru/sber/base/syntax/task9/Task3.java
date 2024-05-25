package ru.sber.base.syntax.task9;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task3 {
    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        weapon.setName("копье");
        Armor armor = new Armor();
        armor.setName("золотая");

        Hero tom = new Hero();

        tom.setName("Том");
        tom.setLvl(10);
        tom.setWeapon(weapon);
        tom.setArmor(armor);

        Path File = Paths.get("hero.txt");
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(String.valueOf(File)));
            oos.writeObject(tom);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(tom);
    }
}
