package lk.ijse.dep10;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, Integer> myLocker = new HashMap<>();
        myLocker.put("First",1);
        myLocker.put("Second", 2);
        myLocker.put("Third",3);

        System.out.println(myLocker.get("First"));
        System.out.println(myLocker.containsKey("Third"));
        myLocker.remove("Third");

        boolean isAvailable = myLocker.containsKey("Third");
        System.out.println(isAvailable);

        myLocker.put("First", 10);
        System.out.println(myLocker.get("First"));
    }
}