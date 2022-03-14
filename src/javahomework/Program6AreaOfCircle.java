
package javahomework;
import java.util.Scanner;

public class Program6AreaOfCircle {
    public static Scanner sc;//static method

    public static void main(String[] args) {
        double radius, area, circumference;//veriable
        sc = new Scanner(System.in);//object created

        System.out.println("\n Please Enter the radius of a circle: ");
        radius = sc.nextDouble();

        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;

        System.out.println("\n Area of a Circle = " + area);
        System.out.println("\n Circumference of a Circle = " + circumference);
    }
}

