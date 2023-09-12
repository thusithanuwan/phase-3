package lk.ijse.dep10.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class SpringBean {

    public SpringBean() {
        System.out.println("SpringBean : NoArg Constructor");
    }
    public SpringBean(Integer integer) {
        System.out.println("SpringBean : Integer Constructor");
    }
    public SpringBean(String string) {
        System.out.println("SpringBean : String Constructor");
    }
    @Autowired
    public SpringBean(@Nullable LocalDate localDate) {
        System.out.println("SpringBean : LocalDate Constructor");
    }
}
