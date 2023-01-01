package com.company.springsecond.annot;

import com.company.springsecond.annot.a.Ripe;
import com.company.springsecond.annot.a.RunMe;
import com.company.springsecond.annot.model.Fruit;
import lombok.SneakyThrows;
import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class UsingAnnotation {

    @SneakyThrows // catches Checked exception and throws Unchecked one
    private static void tryRun(Method method, Object instance) {
        method.invoke(instance);
    }

    @SneakyThrows
    private static void processClass(Class<?> klass) {
        Constructor<?> constructor = klass.getConstructor();
        Object instance = constructor.newInstance();
        Arrays.stream(klass.getMethods())
                .filter(method -> method.isAnnotationPresent(RunMe.class))
                .findFirst()
                .ifPresent(method -> tryRun(method, instance));
    }

    public static void main(String[] args) {
        new Reflections(new ConfigurationBuilder()
                .setScanners(new SubTypesScanner(false), new ResourcesScanner())
                .addUrls(ClasspathHelper.forJavaClassPath())
                .filterInputsBy(new FilterBuilder().includePackage("com.company.springsecond")))
                .getSubTypesOf(Fruit.class)
                .stream()
                .filter(c->c.isAnnotationPresent(Ripe.class))
                .filter(c->c.getAnnotation(Ripe.class).level()>50)
                .forEach(UsingAnnotation::processClass);
    }
}
