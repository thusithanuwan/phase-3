package lk.ijse.dep10.spring;

import lk.ijse.dep10.spring.bean.Spring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Spring spring(){
        return  new Spring();
    }
}

