package lk.ijse.dep10.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        System.out.println(context.containsBeanDefinition("springBean3"));
        context.registerShutdownHook();
    }
}
