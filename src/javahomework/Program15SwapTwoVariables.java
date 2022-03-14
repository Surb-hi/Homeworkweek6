package javahomework;

public class Program15SwapTwoVariables {
    public static void main(String[] args)
    {

        int x = 10; //veriable declration
        int y = 20;

        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int temp = x;//swap logic
        x = y;
        y = temp;

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
