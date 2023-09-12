package lk.ijse.dep10.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class SpringBean4 {

    public SpringBean4(Integer integer) {
        System.out.println("SpringBean4 : Integer Constructor");
    }

}
