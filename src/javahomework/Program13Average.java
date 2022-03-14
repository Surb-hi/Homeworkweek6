package javahomework;

public class Program13Average {

    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 15;
        double num3 = 20;

        double sum = 0.0;//// declare sum variable and initialize with 0
        double avg = 0.0; // declare average variable

        sum = num1 + num2 + num3;// calculate the sum value

        avg = sum/3;// calculate the average value

        // display result
        System.out.println("Average: " + avg );
    }
}
