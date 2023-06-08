package lk.ijse.dep10;

import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        print("Hello", "World");  //  print(new String[]{"Hello", "World"});


    }
    public static void print (String ... args){
        System.out.println(Arrays.toString(args));
    }
}
