
package javahomework;

public class Program4circle {
    int diameter=30;
    int xposition=20;
    static String color="blue";
    static boolean isvisible=false;

    public void circle1() { //Instant method
        System.out.println("This is instant method");
        System.out.println(diameter);
        System.out.println(xposition);
        System.out.println(Program4circle.color);
        System.out.println(Program4circle.isvisible);
    }

    public static void circle2()//static method
    {
        System.out.println("This is my static method");
        System.out.println(color);
        System.out.println(isvisible);
        Program4circle obj= new Program4circle();
        System.out.println(obj.diameter);
        System.out.println(obj.xposition);

    }

    public static void main(String[] args) {
        Program4circle obj= new Program4circle();
        obj.circle1();
        circle2();

    }
}
