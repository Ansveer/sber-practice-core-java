package ru.sber.base.syntax.task9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task3v2 {
    public static void main(String[] args) {
        Path File = Paths.get("hero.txt");

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(String.valueOf(File)));
            Hero hero = (Hero) ois.readObject();
            System.out.println(hero);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
