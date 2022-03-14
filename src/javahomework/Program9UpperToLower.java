package javahomework;
import java.util.Scanner;
public class Program9UpperToLower {
    public static Scanner sc;//static veriable
    public static void main(String[] args) {
        String uppStr;//veriable decelation
        sc= new Scanner(System.in);//object creation

        System.out.print("\nEnter Uppercase String to convert =  ");
        uppStr = sc.nextLine();

        String uppStr2 = uppStr.toLowerCase();
        System.out.println("\nThe Lowercase String  =  " + uppStr2);
    }
}

