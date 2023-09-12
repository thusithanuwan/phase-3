package lk.ijse.dep10.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
//        Object springBean = ctx.getBean("springBean");



        System.out.println("Bean definition " + ctx.containsBeanDefinition("springBean2"));

        ctx.close();
    }
}
