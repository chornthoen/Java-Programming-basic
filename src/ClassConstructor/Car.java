package ClassConstructor;

public class Car {
    int modelYear;
    String modelName;
    public Car(int model,String name){
        modelYear = model;
        modelName = name;
    }

    public static void main(String[] args) {
        Car myCar = new Car(2022,"Ford");
        System.out.println("Model : "+myCar.modelName+ "  Year: "+ myCar.modelYear);
    }
}
