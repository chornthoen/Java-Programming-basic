package Data_Structure1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> Cars = new ArrayList<>();
        Cars.add("Volvo");
        Cars.add("BMW");
        Cars.add("ford");
        System.out.println(Cars);
        System.out.println("-------------------------");

        for (String i: Cars){
            System.out.println(i);
        }

        System.out.println("Sort------");
        Collections.sort(Cars);
        for (String Car : Cars) {
            System.out.println(Car);
        }
        /*
        for(int i=0;i<Cars.size();i++){
            System.out.println(Cars.get(i));
        }*/
        System.out.println("------------------------");
        ArrayList<Integer> Num = new ArrayList<>();
        Num.add(40);
        Num.add(50);
        Num.add(60);
        Num.add(20);
        System.out.println(Num);

        System.out.println("------------------------");
        for (int j : Num){
            System.out.println(j);
        }
        /*
        for (int j=0;j<Num.size();j++){
            System.out.println(Num.get(j));
        }*/

        System.out.println("----------------------");
        System.out.println("Sort--------");
        Collections.sort(Num);
        for (int j: Num){
            System.out.println(j);
        }

        boolean number = Num.contains(40);
        if(number){
            System.out.println("The List contain 30");

        }else {
            System.out.println("The List does not contain 30");
        }
    }
}
