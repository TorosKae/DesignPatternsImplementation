package ru.barinov.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * This class provides basic implementation of Singleton Pattern
 * to use this just make an inheritance of this class
 * initialization processes the next way
 * ru.barinov.singleton.MySingleton mySingleton = null;
 *         try {
 *             mySingleton = ru.barinov.singleton.MySingleton.getInstance(ru.barinov.singleton.MySingleton.class);
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
            throws IllegalAccessException, InstantiationException,
            ClassCastException, InvocationTargetException, NoSuchMethodException {

        if (INSTANCE_MAP.containsKey(instanceClass)) {
            System.out.println(INSTANCE_MAP.size());
            return (T) INSTANCE_MAP.get(instanceClass);
        } else {
            Constructor ctor = instanceClass.getDeclaredConstructor();
            ctor.setAccessible(true);
            T instance = (T) ctor.newInstance();
            INSTANCE_MAP.put(instanceClass, instance);
            System.out.println(INSTANCE_MAP.size());
            return (T) INSTANCE_MAP.get(instanceClass);
        }

    }
}
