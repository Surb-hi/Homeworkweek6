package javahomework;
import java.util.Scanner;
public class Program19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String");//THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
        String line = in.nextLine();
        line = line.toLowerCase();
        System.out.println("Output String");
        System.out.println(line);
    }
}
