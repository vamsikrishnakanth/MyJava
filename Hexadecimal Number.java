//Hexadecimal Number
import java.util.Scanner;
public class SecondClass{
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
        int decimalNumber,rem;
        String hex_dec=""; //intialization 
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        System.out.println("Enter the decimal number");
        decimalNumber=in.nextInt();
        while(decimalNumber>0){
            rem=decimalNumber %16;
            hex_dec=hex[rem]+hex_dec;
            decimalNumber=decimalNumber/16;
            System.out.println("Hexadecimal number is"+ hex_dec);
            System.out.println(rem=decimalNumber %16);
        }
    }
}