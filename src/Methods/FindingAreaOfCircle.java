package Methods;
import java.util.Scanner;
import java.lang.Math;

public class FindingAreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Radius: ");
        double x = scanner.nextInt();

        circle(x);
    }

    public static void circle(double radius) {
        double area = Math.PI* Math.pow(radius, 2);
        double circ = Math.PI* radius * 2;

        System.out.println("Area: "+ area);
        System.out.println("Circumference"+ circ);
    }
}