package lk.ijse.dep10;

public class Demo4 {
    public static void main(String[] args) {

        DEPSpecial depSpecial = new DEPSpecial();
//        doSomething(new DEP());
        doSomething(depSpecial);

    }
    public  static <T extends DEP & IJSE & Institute> void doSomething(T t ){
        System.out.println(t);

    }
}
class DEP{
    void print(){
        System.out.println("Working!");
    }
}
interface IJSE{}
interface Institute{}
class DEPSpecial extends DEP implements IJSE,Institute{}
