package test;


import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args)
            throws InvocationTargetException,
            NoSuchMethodException,
            IllegalAccessException,
            InstantiationException {
        int cnt = 10;
        Thread[] threads = new Thread[cnt];
        for (int i = 0; i < cnt; i++) {
            threads[i] = new Thread(()->{
                try {
                    MySingleton mySingleton = MySingleton.getInstance(MySingleton.class);
                    System.out.println(mySingleton.toString());
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchMethodException e) {
                    e.printStackTrace();
                }
            });
            threads[i].start();
        }

    }
}
