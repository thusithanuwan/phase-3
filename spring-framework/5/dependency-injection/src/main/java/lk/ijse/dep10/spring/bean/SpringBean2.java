package lk.ijse.dep10.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class SpringBean2 {

    public SpringBean2(@Autowired(required = false) Integer i) {
        System.out.println("Spring Bean 2");
    }
}
