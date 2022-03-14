package javahomework;
import java.util.Scanner;
public class Program10MultiplicationTable {
    public static void main(String[] args)//main method
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number:");
        int n=s.nextInt();
        for(int i=1; i <= 10; i++)//condition
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
