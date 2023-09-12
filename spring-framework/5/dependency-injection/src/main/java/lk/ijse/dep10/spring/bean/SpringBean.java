package lk.ijse.dep10.spring.bean;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class SpringBean {
    public SpringBean(String[] string) {
        System.out.println("SpringBean Constructor");
        System.out.println(Arrays.toString(string));
    }
//    public SpringBean(Collection<String> string) {
//        System.out.println("SpringBean Constructor");
//        System.out.println(string);
//    }
//    public SpringBean(List<String> string) {
//        System.out.println("SpringBean Constructor");
//        System.out.println(string);
//    }
//    public SpringBean(Set<String> string) {
//        System.out.println("SpringBean Constructor");
//        System.out.println(string);
//    }
//    public SpringBean(Map<String, String> string) {
//        System.out.println("SpringBean Constructor");
//        System.out.println(string);
//    }
}
