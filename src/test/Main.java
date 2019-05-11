package test;

public class Main {

    public static void main(String[] args) {
        MySingleton mySingleton = null;
        try {
            mySingleton = MySingleton.getInstance(MySingleton.class);
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        System.out.println(mySingleton.toString());
        try {
            MySingleton mySingleton2 = (MySingleton) MySingleton.getInstance(MySingleton.class);
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        System.out.println(mySingleton.toString());
    }
}
