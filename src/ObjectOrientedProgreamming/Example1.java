package ObjectOrientedProgreamming;

public class Example1 {
    static void myMethod(){
        System.out.println("Hello World!!");
    }
    public void myPublic(){
        System.out.println("Hello Guy!!");
    }

    public static void main(String[] args) {
        myMethod();
        Example1 Obj = new Example1();
        Obj.myPublic();
    }
}
