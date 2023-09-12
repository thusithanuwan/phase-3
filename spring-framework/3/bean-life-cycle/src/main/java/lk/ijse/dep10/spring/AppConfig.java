package lk.ijse.dep10.spring;

import lk.ijse.dep10.spring.bean.SpringBean;
import lk.ijse.dep10.spring.bean.SpringBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.security.PublicKey;

@Configuration  @ComponentScan(basePackageClasses = {AppConfig.class})
@ComponentScan("lk.ijse.dep10")
public class AppConfig {

    @Bean
    public SpringBean2 springBean2(){
        return new SpringBean2();
    }
}
