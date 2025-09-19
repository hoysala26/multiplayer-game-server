package Abstraction;

public class TestShapes {
    public static void main(String[] args) {
        shape c = new circle(5);
        shape r = new Rectangle(4, 6);

        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Circle Perimeter: " + c.getPerimeter());

        System.out.println("Rectangle Area: " + r.getArea());
        System.out.println("Rectangle Perimeter: " + r.getPerimeter());
    }
}
