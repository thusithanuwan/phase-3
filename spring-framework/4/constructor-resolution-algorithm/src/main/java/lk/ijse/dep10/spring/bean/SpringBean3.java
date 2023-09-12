package lk.ijse.dep10.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class SpringBean3 {

    public SpringBean3() {
        System.out.println("SpringBean3 : NoArg Constructor");
    }
    public SpringBean3(Integer integer) {
        System.out.println("SpringBean3 : Integer Constructor");
    }
    public SpringBean3(String string) {
        System.out.println("SpringBean3 : String Constructor");
    }
    public SpringBean3(LocalDate localDate) {
        System.out.println("SpringBean3 : LocalDate Constructor");
    }
}
