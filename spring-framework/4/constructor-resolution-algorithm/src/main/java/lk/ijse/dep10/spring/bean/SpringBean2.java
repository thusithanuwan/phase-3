package lk.ijse.dep10.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class SpringBean2 {

    @Autowired(required = false)
    public SpringBean2(Integer integer) {
        System.out.println("SpringBean2 : Integer Constructor");
    }
    @Autowired(required = false)
    public SpringBean2(String string) {
        System.out.println("SpringBean2 : String Constructor");
    }
    @Autowired(required = false)
    public SpringBean2(@Nullable LocalDate localDate, Integer integer) {
        System.out.println("SpringBean2 : LocalDate Constructor");
    }
}
