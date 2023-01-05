package ObjectOrientedProgreamming;

public class Person {

    String fName = "Chorn" ;
    String lName = "Thoen ";
    int age = 18;

    public static void main(String[] args) {
        Person myObj = new Person();
        Person myObj1 = new Person();
        System.out.println("Name: "+myObj.fName +" "+myObj.lName);
        System.out.println("Age : "+myObj.age);
        System.out.println("-----------------------");
        myObj1.fName = "Chorn";
        myObj1.lName = "Thorn";
        myObj1.age = 20;
        System.out.println("Name: "+myObj1.fName +" "+myObj1.lName);
        System.out.println("Age : "+myObj1.age);


    }
}
