package ru.sber.base.syntax.task9;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        InputStreamReader isr = null;
        FileWriter fr = null;
        ArrayList<String> names = new ArrayList<String>();
        int b;
        String tmp = "";
        try {
            fis = new FileInputStream("D:/JavaWorks/sber-practice-core-java/base-syntax/src/ru/sber/base/syntax/task9/listNames.txt");
            isr = new InputStreamReader(fis, "UTF-8");
            fr = new FileWriter("D:/JavaWorks/sber-practice-core-java/base-syntax/src/ru/sber/base/syntax/task9/listNamesSorted.txt");
            while ((b = isr.read()) != -1) {
                while (((char) b != ',') && (b != -1) && ((char) b != ' ') && ((char) b != '\n')) {
                    tmp += (char) b;
                    b = isr.read();
                }
                if (((char) b == ',') || (b == -1)) {
                    names.add(tmp);
                }
                tmp = "";
            }
            Collections.sort(names);
            System.out.println(names);
            fr.write(names.get(0));
            for (int i = 1; i < 11; i++) {
                fr.write(", ");
                fr.write(names.get(i));
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
