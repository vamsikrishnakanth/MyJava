import java.util.Scanner;
class Calculator{
    int n1,n2,n3;

    double sum(int n1,int n2){
        return n1+n2;
    }
    double difference(int n1,int n2){
        return n1-n2;
    }
}
class AdvanceCalculator extends Calculator{ //single inheritance
    double Multiply(int n1,int n2){
        return n1*n2;
    }
    double division(int n1,int n2){
        return n1/n2;
    }

}
class PowerCalculator extends AdvanceCalculator{ //Multiple Inheritance
    double squareOfNumber(int n1, int n3){
        return Math.pow(n1, this.n3);
    }
}


public class SecondClass {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        PowerCalculator cl=new PowerCalculator();
        System.out.println("Enter the number");
        cl.n1=in.nextInt();
        System.out.println("Enter the Second number");
        cl.n2=in.nextInt();
        System.out.println("Enter the Power of the number");
        cl.n3=in.nextInt();
        double x1=cl.sum(cl.n1, cl.n2);
        double x2=cl.difference(cl.n1, cl.n2);
        double x3=cl.Multiply(cl.n1, cl.n2);
        double x4=cl.division(cl.n1, cl.n2);
        double x5=cl.squareOfNumber(cl.n1,cl.n3);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);

    }
}