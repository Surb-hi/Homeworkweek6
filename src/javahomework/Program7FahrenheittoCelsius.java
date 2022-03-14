package javahomework;
import java.util.Scanner;

public class Program7FahrenheittoCelsius {
    public static void main(String arg[])
    {
        double a;
        double c;
        Scanner sc=new Scanner(System.in);//object created
        System.out.println("Enter  Fahrenheit temperature");
        a=sc.nextDouble();
        System.out.println("Celsius temperature is = "+celsius(a));
    }
    public static double celsius(double f)//static method
    {
        return  (f-32)*5/9;//logic
    }
}

