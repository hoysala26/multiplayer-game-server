package oops;

public class Car {
    String brand;
    int year;
    double price;
    // Default constructor
    public Car() {
        this.brand = "Unknown";
        this.year = 0;
        this.price = 0.0;
    }
    // Parameterized constructor
    public Car(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }
    public Car (String brand ,int year){
        this.brand=brand;
        this.year=year;
    }
    // Method to display details
    public void displayCar() {
        System.out.println("Brand: " + brand + ", Year: " + year + ", Price: $" + price);
    }
    public void discount(double percent){
        if (percent > 0 && percent <= 100) {
            price = price - (price * percent / 100);
        } else {
            System.out.println("Invalid discount percent!");
        }
    }
}
