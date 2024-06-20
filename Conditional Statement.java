import java.io.*;
import java.util.Scanner;
public class SecondClass {
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number");
        int x=in.nextInt();
        System.out.println("Enter the Second number");
        int y=in.nextInt();
        if (x==y){
            System.out.println("Both the in put numbers are Equal");
        }
        if(x<y){
            System.out.println("The number1 is less than number2");
        }
        if(x<=y){
            System.out.println("The number1 is less than number2");
        }
        if(x!=y){
            System.out.println("The number1 is not equal number2");
        }

    }

}