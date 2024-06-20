import java.io.*;
import java.util.Scanner;
public class SecondClass {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
     System.out.println("Enter the Temperature in celsius");
     double f=in.nextDouble();
     //celsius =5(F-32)/9
        double c=((5*(f-32))/9);
        System.out.println("Temperature in Celsius :"+c);

    }
}