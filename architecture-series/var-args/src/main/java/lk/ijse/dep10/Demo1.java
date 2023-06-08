package lk.ijse.dep10;

public class Demo1 {
    public static void main(String[] args) {
        print("IJSE");
        print();
        print("Hello", "World");
    }
    public static void print(){
        System.out.println();
    }
    public static void print(String something){
        System.out.println(something);
    }
    public static void print(String arg1, String arg2){
        System.out.println(arg1);
        System.out.println(arg2);
    }
}
