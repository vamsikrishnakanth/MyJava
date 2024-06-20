import java.util.Scanner;
public class SecondClass {
public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number");
    double n1=in.nextDouble();

    if(n1>0){
        if(n1>1) {
            System.out.println("The Entered number is positive small number");
        }
        else if(n1>10000){
            System.out.print("the Enter number is greater than 10k");
        }
        else{
            System.out.print("the entered number is +ve");
        }
    }
    else if (n1<0){
        if(Math.abs(n1)<1) {
            System.out.println("The Entered number is negative number");
        }
        else if(Math.abs(n1)<10000){
            System.out.print("the Enter number is lesser than 10k");
        }
        else{
            System.out.print("the entered number is -ve");
        }
    }
    else if(n1==0){
        System.out.println("Entered number is zero");
    }

}
}
