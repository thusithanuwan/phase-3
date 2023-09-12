package lk.ijse.dep10.spring.bean;

import lk.ijse.dep10.spring.util.Height;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component  @Qualifier("tall") @Height
public class Nipuni  implements GoodGirl {
    @Override
    public void kiss() {
        System.out.println("Ummm Ummmmmmmmm ummmmmmm");
    }

    public Nipuni() {
        System.out.println("Nipuni : Constructor");
    }
}
