package test;

import ru.barinov.AbstractSingleton;

public class MySingleton extends AbstractSingleton{
    private String fieldName;
    private int fieldInt;
    private MySingleton() {
        super();
    }
    private void doDomething(){
        System.out.println("method MySingleton");
    }
}
