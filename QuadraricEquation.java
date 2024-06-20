//Qudratic number
import java.util.Scanner;
public class SecondClass {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of a");
        double a=in.nextDouble();
        System.out.println("Enter the value of b");
        double b=in.nextInt();
        System.out.println("Enter the value of c");
        double c=in.nextInt();
        //Roots of Quadratic Equation;
        double result=b*b-4*a*c;
        System.out.println( "result"+":"+result);
        if(result>0.0){
            double r1=(-b+Math.sqrt(result))/(2*a);
            double r2=(-b-Math.sqrt(result))/(2*a);
            System.out.println("the result is greater than zero" +r1+","+r2);
        }
        else if(result<0.0){
            double r1=-b/2*a;
            System.out.println("the result is less than zero"+r1);
        }
        else{
            System.out.println("the equation has no real roots");
        }
    }
}