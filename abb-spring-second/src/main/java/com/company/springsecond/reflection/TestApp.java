package com.company.springsecond.reflection;

import com.company.springsecond.reflection.Point2D;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class TestApp {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Point2D point2D = new Point2D(10, 13);
        Class<?> klass = point2D.getClass();
        Class<? extends Point2D> klass2 = point2D.getClass();
        System.out.println(klass.getCanonicalName());
        String className = "com.company.springsecond.reflection.Point2D";
        Class<?> aClass = Class.forName(className);
        Constructor<?>[] constructors = aClass.getConstructors();
        Constructor<?> constructorX = aClass.getConstructor(Integer.class, Integer.class);
        System.out.println(constructorX);

        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        Constructor<?> constructorMax = Arrays.stream(constructors).max(Comparator.comparingInt(Constructor::getParameterCount))
                .orElseThrow(() -> new IllegalArgumentException("no constructor found"));
        Constructor<?> constructorMin = Arrays.stream(constructors).min(Comparator.comparingInt(Constructor::getParameterCount))
                .orElseThrow(() -> new IllegalArgumentException("no constructor found"));

//        int maxConstructCount = constructorMax.getParameterCount();
//        int minConstructCount = constructorMin.getParameterCount();
//
//        Class<?>[] maxConstructParameterTypes = constructorMax.getParameterTypes();
//        Class<?>[] minConstructParameterTypes = constructorMin.getParameterTypes();

//        System.out.println(Arrays.toString(minConstructParameterTypes));
        Object instance = constructorMax.newInstance(12, 34, "Alisa");

        Point2D point2D1 = (Point2D) instance;
//        point2D1.printMe();

        String method = "printMe";
        String method2 = "toString";
        Method methodX = aClass.getMethod(method);
        Method methodY = aClass.getMethod(method2);
        Object obj = methodX.invoke(instance);
        Object obj2 = methodY.invoke(instance);
        System.out.println(obj);
        System.out.println(obj2);


    }
}
