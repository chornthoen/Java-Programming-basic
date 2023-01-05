package Object3;
class vehicle{
    protected String brand= "ford";
    public void sound(){
        System.out.println("Tuut,tuut!!");
    }
}
public class Car extends vehicle{
    private String modelName ="Mustang";

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.sound();
        System.out.println(myCar.brand + " "+ myCar.modelName);
    }

}
