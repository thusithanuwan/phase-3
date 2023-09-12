package lk.ijse.dep10.spring.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class SpringBean2 {

    @PostConstruct
    public void initialization(){
        System.out.println("This is Initialization");
    }

    @PreDestroy
    public void destroyed(){
        System.out.println("This is destroyed");
    }
}
