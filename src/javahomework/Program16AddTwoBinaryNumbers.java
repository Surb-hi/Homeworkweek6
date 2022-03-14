package javahomework;

public class Program16AddTwoBinaryNumbers {
    public static void main(String[] args) {

        // Two binary numbers in string format
        String binaryNumber1 = "10", binaryNumber2 = "11";

        // converting strings into binary format numbers
        int integer1 = Integer.parseInt(binaryNumber1, 2);
        int integer2 = Integer.parseInt(binaryNumber2, 2);

        // adding two integers
        Integer output = integer1 + integer2;

        // converting final output back to Binary Integer
        System.out.println("Output: " + Integer.toBinaryString(output));

    }
}
