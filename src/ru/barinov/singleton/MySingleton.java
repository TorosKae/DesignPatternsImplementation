package ru.barinov.singleton;

import ru.barinov.singleton.AbstractThreadSafeSingleton;

public class MySingleton extends AbstractThreadSafeSingleton {
    private String fieldName;
    private int fieldInt = 0;
//    private ru.barinov.singleton.MySingleton() {
//        super();
//    }
    public void doDomething(String name){
        this.fieldInt ++;
        this.fieldName = name;
        System.out.println("method ru.barinov.singleton.MySingleton");
    }
}
