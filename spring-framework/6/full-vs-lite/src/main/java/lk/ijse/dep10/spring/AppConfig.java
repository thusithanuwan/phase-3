package lk.ijse.dep10.spring;

import lk.ijse.dep10.spring.bean.SpringBean2;
import lk.ijse.dep10.spring.bean.SpringBean4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration @ComponentScan
public class AppConfig {

//    @Bean
//    public SpringBean2 springBean2(){         // ! SpringBean 2 in full mode
//        springBean4();
//        springBean4();
//        springBean4();
//        springBean4();
//        print();
//        print();
//        print();
//        return new SpringBean2(springBean4());
//    }
//
//    public void print(){
//        System.out.println("Hi");
//    }
//
//    @Bean
//    public SpringBean4 springBean4() {
//        System.out.println("Hello");
//        return new SpringBean4();
//    }
}
