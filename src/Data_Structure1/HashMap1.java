package Data_Structure1;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer> str = new HashMap<>();
        str.put("English",11);
        str.put("Cambodia",22);
        System.out.println(str);
        for (String i : str.keySet()){
            System.out.println(i);
        }
        System.out.println("-------------------------");
        for (Integer i : str.values()){
            System.out.println(i);
        }
        System.out.println("-------------------------");
        for (String i : str.keySet()){
            System.out.println("Key : "+i+ " ,Value : " + str.get(i));
        }
        System.out.println("Is the value 11 present ? "+ str.containsValue(33));
        System.out.println("Is the key Cambodia present? "+ str.containsKey("Cambodia"));
    }
}
