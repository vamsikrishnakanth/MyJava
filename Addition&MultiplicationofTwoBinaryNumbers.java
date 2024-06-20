import java.util.Scanner;
class CalculationOfBinaryNumbers{
    int n1,n2,n3,n4;
    String x,y;
    void InputDataOfBinaryNumbers(String x,String y){
      n1=Integer.parseInt(x,2);
      n2=Integer.parseInt(y,2);
        System.out.println("n1 :"+Integer.toBinaryString(n1));
        System.out.println("n2 :"+Integer.toBinaryString(n2));

    }
    void AdditionodBinaryNumbers(){
         n3=n1+n2;
        System.out.println("n3 :"+Integer.toBinaryString(n3));
    }
    void MultiplicationofBinaryNumber(){
        n4=n1*n2;
        System.out.println("n4 :"+Integer.toBinaryString(n4));
    }

}
public class SecondClass{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        CalculationOfBinaryNumbers clb=new CalculationOfBinaryNumbers();
        System.out.println("Enter the First Binary number");
        clb.x=in.next();
        System.out.println("Enter the Second Binary number");
        clb.y=in.next();
        clb.InputDataOfBinaryNumbers(clb.x,clb.y);
        clb.AdditionodBinaryNumbers();
        clb.MultiplicationofBinaryNumber();


    }

}