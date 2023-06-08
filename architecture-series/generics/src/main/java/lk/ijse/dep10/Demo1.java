package lk.ijse.dep10;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        myMethod("Hello");
        Demo1.<String>myMethod("World"); // ! Actual Syntax
        myMethod(56);
        myMethod(new Scanner(System.in));



    }

    public static <T> void myMethod(T something){
        T abc;
        System.out.println(something);
    }
}
