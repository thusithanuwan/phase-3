package lk.ijse.dep10.spring.bean;

import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SpringBean3
{
    public SpringBean3() {
        System.out.println("SpringBan 3");
    }
    @PostConstruct
    public void initialize(){
        System.out.println("Spring 3 : Initialize");
    }


    @PreDestroy
    public void destroyed(){
        System.out.println("Spring 3 : Destroyed");
    }


}
