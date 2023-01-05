package Data_Structure1;

import java.util.Hashtable;
import java.util.Map;

public class Hashtable1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> hm = new Hashtable<>();
        hm.put(100,"Thoen");
        hm.put(200,"Thorn");
        for (Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey()+" " + m.getValue());
        }
    }
}
