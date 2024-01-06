package homeworks.hw22;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestRunner {


    private static void invokeMethod(Method method, Object obj) {
        try {
            method.invoke(obj);
            System.out.println("Виконується метод: " + method.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void start(Class testClass){
     try {
        Object testObject = testClass.newInstance();
        List<Method> methods = Arrays.asList(testClass.getDeclaredMethods());

        // Перевірка наявності лише одного методу @BeforeSuite і @AfterSuite
        long beforeSuiteCount = methods.stream().filter(m -> m.isAnnotationPresent(BeforeSuite.class)).count();
        long afterSuiteCount = methods.stream().filter(m -> m.isAnnotationPresent(AfterSuite.class)).count();

        if (beforeSuiteCount > 1 || afterSuiteCount > 1) {
            throw new RuntimeException("Повинен бути лише один метод @BeforeSuite та один метод @AfterSuite");
        }

        // Виконання методу @BeforeSuite
        methods.stream().filter(m -> m.isAnnotationPresent(BeforeSuite.class))
                .forEach(m -> invokeMethod(m, testObject));

        // Виконання методів @Test згідно з пріоритетом
        methods.stream().filter(m -> m.isAnnotationPresent(Test.class))
                .sorted(Comparator.comparingInt(m -> m.getAnnotation(Test.class).priority()))
                .forEach(m -> invokeMethod(m, testObject));

        // Виконання методу @AfterSuite
        methods.stream().filter(m -> m.isAnnotationPresent(AfterSuite.class))
                .forEach(m -> invokeMethod(m, testObject));

    }
     catch (Exception e) {
        e.printStackTrace();
    }



    }
}
