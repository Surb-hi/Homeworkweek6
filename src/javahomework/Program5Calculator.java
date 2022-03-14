package javahomework;

public class Program5Calculator {

        int a = 50;//Instance variable
        int b = 60;//Instance variable
        static int c = 70;//Static variable
        static int d = 80;//Static variable

        //Instance method
        public void addition() {
            System.out.println("Addition "+ "= "+(a+b));
            System.out.println("Addition "+ "= "+(c+d));
        }
        public void subtraction(){
            System.out.println("subtraction "+"= "+(a-b));
            System.out.println("subtraction "+"= "+(d-c));

        }

        //Static method
        public static void multiplication(){
            Program5Calculator obj  = new Program5Calculator();
            System.out.println("multiplication "+"= "+(obj.a*c));
            System.out.println("multiplication "+"= "+(obj.c*d));

        }
        public static void division(){
            Program5Calculator obj = new Program5Calculator();
            System.out.println("division "+"= "+(d/obj.b));
            System.out.println("division "+"= "+(c/obj.d));
        }

        //main method
        public static void main(String[] args) {
            Program5Calculator obj = new Program5Calculator();
            //Calculator t = new Calculator();
            obj.addition();
            obj.subtraction();
            multiplication();
            division();
        }
    }


