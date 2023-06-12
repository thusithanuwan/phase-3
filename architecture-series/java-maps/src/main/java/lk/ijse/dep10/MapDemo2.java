package lk.ijse.dep10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> myLocker = new LinkedHashMap<>();
        myLocker.put("Fourth",4);
        myLocker.put("Third",3);
        myLocker.put("First",1);
        myLocker.put("Second", 2);



        System.out.println(myLocker.get("First"));
        System.out.println(myLocker.containsKey("Third"));
        myLocker.remove("Third");

        boolean isAvailable = myLocker.containsKey("Third");
        System.out.println(isAvailable);

        myLocker.putIfAbsent("First", 10);
        System.out.println(myLocker.get("First"));


        System.out.println(myLocker);
    }
}