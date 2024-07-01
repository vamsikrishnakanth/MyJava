import java.util.Scanner;
class Calculator{
    int n1,n2;
    double sum,difference,Multiply,division;
    double sum(int n1,int n2){
        return n1+n2;
    }
    double difference(int n1,int n2){
        return n1-n2;
    }
}
class AdvanceCalculator extends Calculator{
    double Multiply(int n1,int n2){
        return n1*n2;
    }
    double division(int n1,int n2){
        return n1/n2;
    }

}

public class SecondClass {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        AdvanceCalculator cl=new AdvanceCalculator();
        System.out.println("Enter the number");
        cl.n1=in.nextInt();
        System.out.println("Enter the Second number");
        cl.n2=in.nextInt();
        double x1=cl.sum(cl.n1, cl.n2);
        double x2=cl.difference(cl.n1, cl.n2);
        double x3=cl.Multiply(cl.n1, cl.n2);
        double x4=cl.division(cl.n1, cl.n2);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);

    }
}