package ru.barinov.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * This class provides basic implementation of Singleton Pattern
 * It is thread safe
 * Double Checked Locking & volatile implementation
 * to use this just make an inheritance of this class
 * initialization processes the next way
 * MySingleton mySingleton = null;
 * try {
 * mySingleton = MySingleton.getInstance(MySingleton.class);
 * } catch (IllegalAccessException | InstantiationException e) {
 * e.printStackTrace();
 * }
 */
public class AbstractThreadSafeSingleton {
    private static Map<Class<? extends AbstractThreadSafeSingleton>, AbstractThreadSafeSingleton> INSTANCE_MAP
            = new ConcurrentHashMap<>();

    protected AbstractThreadSafeSingleton() {
    }

    public static <T extends AbstractThreadSafeSingleton> T getInstance(Class<T> instanceClass)
            throws IllegalAccessException, InstantiationException,
            ClassCastException, InvocationTargetException, NoSuchMethodException {
        synchronized (AbstractThreadSafeSingleton.class) {
            if (INSTANCE_MAP.containsKey(instanceClass)) {
                return (T) INSTANCE_MAP.get(instanceClass);
            } else {
                Constructor ctor = instanceClass.getDeclaredConstructor();
                ctor.setAccessible(true);
                T instance = (T) ctor.newInstance();
                INSTANCE_MAP.put(instanceClass, instance);
                return (T) INSTANCE_MAP.get(instanceClass);
            }
        }
    }
}
