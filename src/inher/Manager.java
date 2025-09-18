package inher;

public class Manager extends employee {
    String department;

    public Manager(String name, double salary, String department) {
        super(name, salary); 
        this.department = department;
    }   
    @Override
    public void displayDetails() { 
        super.displayDetails(); 
        System.out.println("Department: " + department);
    } 
    
}
