package Utils;

public class MathHelper {
    public static final double PI = 3.14159;
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero not allowed");
        }
        return (double) a / b;
    }
}
