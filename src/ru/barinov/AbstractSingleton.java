package ru.barinov;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * This class provides basic implementation of Singleton Pattern
 * to use this just make an inheritance of this class
 * initialization processes the next way
 * MySingleton mySingleton = null;
 *         try {
 *             mySingleton = MySingleton.getInstance(MySingleton.class);
 *         } catch (IllegalAccessException | InstantiationException e) {
 *             e.printStackTrace();
 *         }
 */
public class AbstractSingleton {
    private static Map<Class<? extends AbstractSingleton>, AbstractSingleton> INSTANCE_MAP
            = new HashMap<>();

    protected AbstractSingleton() {
    }

    public static <T extends AbstractSingleton> T getInstance(Class<T> instanceClass)
            throws IllegalAccessException,
            InstantiationException,
            ClassCastException {

        if (INSTANCE_MAP.containsKey(instanceClass)) {
            return (T) INSTANCE_MAP.get(instanceClass);
        } else {
            try {
                Constructor ctor = instanceClass.getDeclaredConstructor();
                ctor.setAccessible(true);
                T instance = (T) ctor.newInstance();
                ctor.setAccessible(false);
                INSTANCE_MAP.put(instanceClass, instance);
            } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
                e.printStackTrace();
            }
            return (T) INSTANCE_MAP.get(instanceClass);
        }
    }
}
