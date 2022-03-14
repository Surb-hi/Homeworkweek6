package javahomework;
//create class name Program1Instancevariable

public class Program1Instancevariable {
    //Instant veriable inside the class and out side mothod.

    int salary =10000;//instant veriable 1 ,int datatype
    String companyname ="prime";//Instant veriable 2,String datatype

    public void Data() { //Instant method
        System.out.println(salary);
        System.out.println(companyname); }

    public static void main(String[] args) { //Main method
        Program1Instancevariable obj = new Program1Instancevariable();
        obj.Data();//call static method


    }
    }
