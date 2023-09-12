package lk.ijse.dep10.spring.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan
public class Spring {

    public Spring(){
        System.out.printf("Hello");
    }
}
