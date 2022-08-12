public class Circle {
    private final static double PI = Math.PI;

    public static double area(double radius) {
        return PI * (radius * radius);
    }

    public static double circumference(double radius) {
        return PI * 2 * radius;
    }
}
