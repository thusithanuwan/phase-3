package lk.ijse.dep10.spring.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SpringBean4 {


    public SpringBean4() {
        System.out.println("Spring 4: Constructor");
    }

    @PostConstruct
    public void initialize(){
        System.out.println("Spring 4 : Initialize");
    }


    @PreDestroy
    public void destroyed(){
        System.out.println("Spring 4 : Destroyed");
    }
}
