package ru.sber.base.syntax.task9;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        InputStreamReader isr = null;
        FileWriter fr = null;
        int b;
        try {
            fis = new FileInputStream("D:/JavaWorks/sber-practice-core-java/base-syntax/src/ru/sber/base/syntax/task9/Borodino.txt");
            isr = new InputStreamReader(fis, "UTF-8");
            fr = new FileWriter("D:/JavaWorks/sber-practice-core-java/base-syntax/src/ru/sber/base/syntax/task9/Borodino2.txt");
            while ((b = isr.read()) != -1) {
//                fr.write((char) b);
//                System.out.print((char)b);
                if ((char) b == ' ') {
                    fr.write((char) b);
                    b = isr.read();
                    while ((char) b == ' ') {
                        b = isr.read();
                    }
                    fr.write((char) b);
                } else {
                    fr.write((char) b);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
