import java.util.Scanner;
class BinaryCalculation{
    int n1,n2,n3,n4;
    String x,y;
   void displayBinaryInput(){
       System.out.println("binary numbers n1:"+Integer.toBinaryString(n1));
       System.out.println("binary numbers n2:"+Integer.toBinaryString(n2));
   }
    void sumOfBinaryNumbers(){
        n3=n1+n2;
        System.out.println("sum of two binary numbers:"+Integer.toBinaryString(n3));
    }
    void multiplyOfBinaryNumber(){
        n4=n1*n2;
        System.out.println("Multiplication of two binary numbers:"+Integer.toBinaryString(n4));

    }
}
public class SecondClass {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        BinaryCalculation bc=new BinaryCalculation();
        System.out.println("Enter the first binary number");
        bc.x=in.next();
        System.out.println("Enter the Second Binary number");
        bc.y=in.next();
        bc.n1=Integer.parseInt(bc.x,2);
        bc.n2=Integer.parseInt(bc.y,2);
        bc.displayBinaryInput();
        bc.sumOfBinaryNumbers();
        bc.multiplyOfBinaryNumber();
    }
}