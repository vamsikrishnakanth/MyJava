import java.util.Scanner;
public class SecondClass{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        String x=in.next();
        System.out.println("Enter the number");
        String y=in.next();

        int n1=Integer.parseInt(x,2);
        int n2=Integer.parseInt(y,2);
        int n3=n1+n2;

        System.out.print("n1 :"+Integer.toBinaryString(n1));
        System.out.print("n2 :"+Integer.toBinaryString(n2));
        System.out.print("n1+n2=n3 :"+Integer.toBinaryString(n3));
    }
}