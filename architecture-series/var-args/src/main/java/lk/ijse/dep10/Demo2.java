package lk.ijse.dep10;

import java.util.stream.Stream;

public class Demo2 {
    public static void main(String[] args) {
        print(new String[]{"IJSE"});
        print(new String[]{""});
        print(new String[]{"Hello", "World", "How are u" , "what is your name ?"});

    }
    public static void print(String[] args){
        if (args == null){
            return;
        }
        Stream.of(args).forEach(System.out::println);
//        for (String arg : args) {
//            System.out.println(arg);
//        }
    }
}
