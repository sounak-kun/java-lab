import java.util.*;

class Circle {
    private static final double PI = 3.14;
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(Circle other) {
        this.radius = other.radius;
    }
    public Circle deepCopy() {
        return new Circle(this.radius);
    }
    public double calcArea() {
        double area = PI * radius * radius;
        return area;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}

public class Two {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        Circle one = new Circle(radius);

        System.out.println("Area: " + one.calcArea());

        System.out.println("\n\nShallow Copy");
        Circle two = one;

        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
        two.setRadius(radius);

        System.out.println("Circle 1 area: " + one.calcArea());
        System.out.println("Circle 2 area: " + two.calcArea());

        System.out.println("\n\nDeep Copy");
        Circle three = one.deepCopy();

        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
        three.setRadius(radius);

        System.out.println("Circle 1 area: " + one.calcArea());
        System.out.println("Circle 3 area: " + three.calcArea());

        sc.close();
    }
}
