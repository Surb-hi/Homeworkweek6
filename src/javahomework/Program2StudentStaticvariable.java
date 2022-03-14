package javahomework;

public class Program2StudentStaticvariable {
    static int rollno = 30;
    static String Name = "surbhi";

    public static void Attendance()//Static variabl
    {
        System.out.println(Program2StudentStaticvariable.rollno);
        System.out.println(Program2StudentStaticvariable.Name);
    }

    public static void main(String[] args) {
        Attendance();//call static method
    }
}