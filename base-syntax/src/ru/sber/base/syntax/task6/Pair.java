package ru.sber.base.syntax.task6;

public class Pair<T, S> {
    private T key;
    private S value;

    public Pair(T key, S value){
        this.key = key;
        this.value = value;
    }

    public T getKey(){
        return key;
    }
    public void setKey(T key){
        this.key = key;
    }
    public S getValue(){
        return value;
    }
    public void setValue(S value){
        this.value = value;
    }
    public void set(T key, S value){
        setKey(key);
        setValue(value);
    }
    public String toString() {
        return "" + key + '=' + value;
    }
}
