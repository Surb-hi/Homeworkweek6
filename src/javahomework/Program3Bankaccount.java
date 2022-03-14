package javahomework;

public class Program3Bankaccount {
    int balance = 1000;//instant veriable
    static int accountNumber =12345677;//static veriable

    public void Accountdetails() {
        System.out.println("This output comes form instant method");
        System.out.println(balance);//Instant method
        System.out.println( Program3Bankaccount.accountNumber);
    }

    public static void Accountdetails1(){
        System.out.println("This output comes from static method");
        System.out.println(accountNumber);//static method
        Program3Bankaccount obj = new  Program3Bankaccount();
        System.out.println(obj.balance);
    }

    public static void main(String[] args) {
        Accountdetails1();//call static method
        Program3Bankaccount obj= new Program3Bankaccount();
        obj.Accountdetails();

    }
}
