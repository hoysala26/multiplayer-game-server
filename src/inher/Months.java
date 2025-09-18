package inher;

public class Months extends employee{
    int durationMonths;

    public Months(String name, double salary, int durationMonths){
        super(name, salary);
        this.durationMonths=durationMonths;
    }
    public void durationMonths(){
        super.displayDetails();
        System.out.println("durationMonths"+" "+durationMonths);
    }
}
