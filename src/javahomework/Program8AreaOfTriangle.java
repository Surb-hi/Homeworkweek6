package javahomework;
import java.util.Scanner;
public class Program8AreaOfTriangle{
    public  static Scanner sc;//static veriable

    public static void main(String[] args) {
        double a, b, c, Perimeter, s, Area;//veriable alocation
        sc = new Scanner(System.in);//object creation

        System.out.println("\n Please Enter Three sides of triangle: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        Perimeter = a + b + c;
        s = (a + b + c)/2; // Perimeter/2
        Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));


        System.out.format("\n The Perimeter of Traiangle = %.2f\n", Perimeter);
        System.out.format("\n The Semi Perimeter of Traiangle = %.2f\n",s);
        System.out.format("\n The Area of triangle = %.2f\n",Area);
    }
}

