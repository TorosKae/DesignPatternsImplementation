import ru.barinov.singleton.AbstractThreadSafeSingleton;

public class MySingleton extends AbstractThreadSafeSingleton {
    private String fieldName;
    private int fieldInt = 0;
//    private MySingleton() {
//        super();
//    }
    public void doDomething(String name){
        this.fieldInt ++;
        this.fieldName = name;
        System.out.println("method MySingleton");
    }
}
