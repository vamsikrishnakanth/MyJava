import java.util.Scanner;
public class SecondClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       System.out.println("Enter the First integer number");
       int x=in.nextInt();

        System.out.println("n1 :"+Integer.toBinaryString(x));
		}
		}
Converting the Decimal number to the hexadecimal value

//Hexadecimal Numbers: 0,1,2,4,5,6,7,8,9,A,B,C,D,E,F.
//      Decimal value: 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15.

/* if we take the Decimal Value =775
Integer Part   Quotient Remainder Part (Remainder in Hexadecimal value)
775/16         48        7               7
48/16          3         0               0
3/16           0         3               3

 Hexadecimal value =307.
 */		