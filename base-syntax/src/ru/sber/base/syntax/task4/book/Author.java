package ru.sber.base.syntax.task4.book;

public class Author {
    public String name;
    public String sex;
    public String email;

    public Author(String name, String sex, String email) {
        this.name = name;
        this.sex = sex;
        this.email = email;
    }
    public Author() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        System.out.println(name);
        System.out.println(sex);
        System.out.println(email);
        return "";
    }
}
