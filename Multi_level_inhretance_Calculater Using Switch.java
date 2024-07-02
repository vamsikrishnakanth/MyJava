import java.util.Scanner;
class Calculator{
    double n1,n2,x,y,z,w,p;
    void sum(double n1, double n2){
        x = n1 + n2;
    }
    void difference(double n1,double n2){
         y=n1-n2;
    }
}
class AdvancedCalculator extends Calculator{
    void multiply(double n1,double n2){
         z=n1*n2;
    }
    void division(double n1, double n2){
         w=n1/n2;
    }
}
class PowerCalculator extends AdvancedCalculator{
    void power(double n1,double n3){
         p=Math.pow(n1,n3);
    }
}
public class SecondClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PowerCalculator pc = new PowerCalculator();
        System.out.println("Enter the Required Calculation" + ","
                + "if required sum enter x" + ","
                + "if required Subtraction enter y" + ","
                + "if required multiplication enter z" + ","
                + "if required division enter w" + ","
                + "if required power calculation enter p ");
        String requiredCalculation = in.next();
        System.out.println("Enter calculation is :" + requiredCalculation);
        System.out.println("Enter the number n1");
        pc.n1 = in.nextDouble();
        System.out.println("Enter the number n2");
        pc.n2 = in.nextDouble();
        switch (requiredCalculation) {
            case "sum" -> {
                pc.sum(pc.n1, pc.n2);
                System.out.println(pc.x);
            }
            case "sub" -> {
                pc.difference(pc.n1, pc.n2);
                System.out.println(pc.y);
            }
            case "mul" -> {
                pc.multiply(pc.n1, pc.n2);
                System.out.println(pc.z);
            }
            case "div" -> {
                pc.division(pc.n1, pc.n2);
                System.out.println(pc.w);
            }
            case "pow" -> {
                pc.power(pc.n1, pc.n2);
                System.out.println(pc.p);
            }
            default -> System.out.println("Entered char is out of the bound");
        }
        }
    }