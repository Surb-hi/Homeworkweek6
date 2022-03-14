

package javahomework;

import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);//obj creation

        int a;//a=125 veriable created
        int b;//b=24

        System.out.println("Enter two numbers");
        a = obj.nextInt();
        b = obj.nextInt();

        System.out.println(a + " + " + b + " = " +
                (a+b));

        System.out.println(a + " - " + b + " = " +
                (a-b));

        System.out.println(a + " x " + b + " = " +
                (a * b));

        System.out.println(a + " / " + b + " = " +
                (a/b));

        System.out.println(a + " mod " + b + " = " +
                (a % b));
    }
}
