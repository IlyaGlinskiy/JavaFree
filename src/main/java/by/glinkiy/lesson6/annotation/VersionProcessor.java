package by.glinkiy.lesson6.annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class VersionProcessor {

    public void getVersion(Class<? extends MyService> clazz) throws Exception {
        boolean annotPresent = clazz.isAnnotationPresent(Version.class);
        if (annotPresent) {
            Constructor<?> constructor = clazz.getConstructor();
            MyService myService = (MyService) constructor.newInstance();
            Method method = clazz.getDeclaredMethod("thisClassInfo");
            System.out.println(method);
            method.setAccessible(true);
            method.invoke(myService);
        } else System.out.println("Not available true data");
    }
}