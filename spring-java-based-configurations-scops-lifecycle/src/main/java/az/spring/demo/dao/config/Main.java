package az.spring.demo.dao.config;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("baku", 1);
        properties.put("salyan", 2);
        properties.put("sirvan", 3);
        properties.put("seki", 4);
        Collection<Object> points = properties.values();
        Iterator<Object> iteratorKeys = points.iterator();
        while (iteratorKeys.hasNext()) {
            Integer point = (Integer) iteratorKeys.next();
            System.out.println(point);
        }
        Set<Object> capital = properties.keySet();
        Iterator<Object> iteratorKeySet = capital.iterator();
        while (iteratorKeySet.hasNext()) {
            String str = (String) iteratorKeySet.next();
            System.out.println(str);
        }
    }
}
