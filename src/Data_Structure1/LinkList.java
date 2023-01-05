package Data_Structure1;

import java.util.Collections;
import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {

        LinkedList<String > car = new LinkedList<>();
        car.add("Volvo");
        car.add("BMW");
        car.add("Ford");
        car.addLast("Mazda");
        car.addFirst("TOYOTA");
        //car.removeFirst();
        //car.removeFirst();
        //System.out.println(car.getFirst());
        //System.out.println(car.getLast());
        System.out.println(car);
        System.out.println("-------------------");
        for (String i : car){
            System.out.println(i);
        }
        System.out.println("-----------------------");
        System.out.println("Sort----------");
        Collections.sort(car);
        for (String i: car){
            System.out.println(i);
        }
        System.out.println("-------------------");
        LinkedList<Integer> num = new LinkedList<>();
        num.add(4);
        num.add(3);
        num.add(5);
        num.addFirst(9);
        num.addLast(1);
        //num.removeFirst();
        //num.removeLast();
        //System.out.println(num.getLast());
        //System.out.println(num.getFirst());
        System.out.println(num);
        for (int j: num){
            System.out.println(j);
        }
        System.out.println("--------------------");
        System.out.println("Sort--------");
        Collections.sort(num);
        for (int j: num){
            System.out.println(j);
        }

    }

}
