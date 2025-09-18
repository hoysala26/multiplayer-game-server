package inher;

public class Main {
    public static void main(String[] args) {
        employee e1 = new employee("Alice", 40000);
        e1.displayDetails();

        Manager m1 = new Manager("Bob", 60000, "IT");
        m1.displayDetails();

        Months m2  =new Months("ravi",670000, 6);
        m2.durationMonths();
    }
}
