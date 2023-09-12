package lk.ijse.dep10.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration @ComponentScan
public class AppConfig {

    @Order(3)
    @Bean
    public String myString1(){
        return "Method 1 : IJSE";
    }
    @Order(2)
    @Bean
    public String myString2(){
        return "Method 2 : IJSE";
    }
    @Order(1)
    @Bean
    public String myString3(){
        return "Method 3 : IJSE";
    }
}
