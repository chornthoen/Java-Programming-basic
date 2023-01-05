package ObjectOrientedProgreamming;

public class Car {
    public void fullSpeed(){
        System.out.println("This is my Car!!");
    }
    public void speedAt(int speed){
        System.out.println("Speed is: "+speed);
    }
    public int getSpeed(){
        return 300;
    }
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.fullSpeed();
        myCar.speedAt(200);
        System.out.println(myCar.getSpeed());
    }
}
