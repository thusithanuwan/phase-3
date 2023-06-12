package lk.ijse.dep10;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo3 {
    public static void main(String[] args) {
        /*Based on  Red-Black Binary Tree */
        Map<String, Integer> myLocker = new TreeMap<>();
        myLocker.put("Fourth",4);
        myLocker.put("Third",3);
        myLocker.put("First",1);
        myLocker.put("Second", 2);

        System.out.println(myLocker);
    }
}