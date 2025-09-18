package inher;

public class employee {
    String name;
    double salary;

    public employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee: " + name + ", Salary: $" + salary);
    }
}
