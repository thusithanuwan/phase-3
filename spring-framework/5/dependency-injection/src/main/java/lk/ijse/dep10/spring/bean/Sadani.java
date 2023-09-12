package lk.ijse.dep10.spring.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("sadani") @Primary @Qualifier("tall")
public class Sadani implements GoodGirl {

    @Override
    public void kiss() {
        System.out.println("Ummmmmmmmmmmmmmmmm");
    }


    public Sadani() {
        System.out.println("Sadani : Constructor");
    }
}
