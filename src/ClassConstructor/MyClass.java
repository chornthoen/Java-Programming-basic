package ClassConstructor;

public class MyClass {
    int x;
    int y;
    public MyClass(int z){
        x = 10;
        y = z;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(30);
        obj.x = 20;
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
}
