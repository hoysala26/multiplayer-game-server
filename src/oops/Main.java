package oops;

public class Main {
    public static void main(String[] args) {
        // Using default constructor
        Car car1 = new Car();
        car1.displayCar();
        // Using parameterized constructor
        Car car2 = new Car("Tesla", 2022, 65000.0);
        car2.displayCar();
        // Another object
        Car car3 = new Car("Toyota", 2019, 20000.0);
        car3.displayCar();
        Car car4 = new Car("bmw",2004);
        car4.displayCar();
        car4.discount(40);
        System.out.println("apply discount");
        car2.discount(20);
        car2.displayCar();
    }
}
