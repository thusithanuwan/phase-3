package lk.ijse.dep10.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBean2 {

    public SpringBean2() {
        System.out.println("SpringBan 2");

    }
    @Autowired
    public SpringBean2(SpringBean4 springBean4) {
        System.out.println("SpringBan 2 with SpringBean3 " + springBean4);
    }


}
