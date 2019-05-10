package ru.barinov;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class AbstractSingleton {
    private static Map<Class<? extends AbstractSingleton>, AbstractSingleton> INSTANCE_MAP
            = new HashMap<>();

    protected AbstractSingleton() {
    }

    public static <T extends AbstractSingleton> T getInstance(Class<T> instanceClass)
            throws  IllegalAccessException,
                    InstantiationException,
                    ClassCastException {
        System.out.println("instanceClass "+instanceClass);
        if (INSTANCE_MAP.containsKey(instanceClass)) {
            System.out.println("1");
            return (T) INSTANCE_MAP.get(instanceClass);
        }
        else {
            System.out.println("2");
            try {
                INSTANCE_MAP.put(instanceClass, instanceClass.getDeclaredConstructor().newInstance());
            } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
                e.printStackTrace();
            }
            return (T) INSTANCE_MAP.get(instanceClass);
        }
    }
}
