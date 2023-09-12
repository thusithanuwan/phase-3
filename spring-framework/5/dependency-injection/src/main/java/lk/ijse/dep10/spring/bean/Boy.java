package lk.ijse.dep10.spring.bean;

import lk.ijse.dep10.spring.util.Height;
import lk.ijse.dep10.spring.util.Injector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("paniya")
public class Boy{

    @Autowired
    private final @Qualifier("tall") GoodGirl girlFriend; // ! This is a property injection

    // ! This is setter method injection
//    @Autowired
//    public void setGirlFriend(GoodGirl girlFriend) {
//        System.out.println("Setter");
//        this.girlFriend = girlFriend;
//    }

    public Boy(@Qualifier("tall") @Height GoodGirl girlFriend) {
        this.girlFriend = girlFriend;
        System.out.println(girlFriend instanceof Nipuni);
        System.out.println("Paniya : Constructor");
        System.out.println("Paniya: Hava I got girlfriend in Constructor ? " + girlFriend);
    }

//    public Boy() {
//        System.out.println("Paniya : Constructor");
//        System.out.println("Paniya: Hava I got girlfriend in Constructor ? " + girlFriend);
//
//    }
//
//    @PostConstruct
//    public void initialize() {
//        System.out.println("Paniya: Hava I got girl friend ? " + girlFriend);
//        if (girlFriend != null) {
//            girlFriend.kiss();
//        }
//    }


//  @Autowired
//    @Override
//    public void inject(GoodGirl goodGirl) {
//        System.out.println("Interface through injection");
//        this.girlFriend = goodGirl;
//}

    @PostConstruct
    public void postConstruct(){
        System.out.println("post construct " + this.girlFriend);
    }
}
