package Oop_MemberA;

public class MyClass1 {
    static void staticMethod(){
        System.out.println("Static is called");

    }
    public void pubMethod(){
        System.out.println("Public is called");
    }

    public static void main(String[] args) {
        MyClass1.staticMethod();
        MyClass1 obj = new MyClass1();

        obj.pubMethod();
    }

}
