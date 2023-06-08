package lk.ijse.dep10;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        myGenericMethod1("Thusitha");
        myGenericMethod1(10);
        myGenericMethod2("id",1);
        myGenericMethod2("name","kasun");
        myGenericMethod2("address","Galle");
        myGenericMethod2("dob", LocalDateTime.now());


        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(50);
        dynamicArray.add(50);
        dynamicArray.add(50);
        dynamicArray.print();

    }
    public static <T> void myGenericMethod1(T t){
        System.out.println(t);

    }
    public static <K, V> void myGenericMethod2(K k, V v){
        System.out.printf("Key=%s, Values=%s", k,v);

    }

}
class DynamicArray<T>{
    private Object[] elements = new Object[0];

/* !   private static T classVariables;
  !    private T instance;

*/

    public void add(int element){
        Object[] newElmArray = new Object[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newElmArray[i] = elements[i];

        }
        newElmArray[newElmArray.length -1] = element;
        elements = newElmArray;
    }
    public void print(){
        System.out.println(Arrays.toString(elements));
    }
}
