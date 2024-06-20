
import java.util.Scanner;
public class SecondClass {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Symbol");
        String symbol=in.next();
        System.out.println("Enter the number of columns");
        int columns=in.nextInt();
        System.out.println("Enter the number rows");
        int rows=in.nextInt();
        for(int i=0;i<=columns;i++){
            System.out.println();
            for(int j=0;j<rows;j++){
                System.out.print(symbol);
            }
        }
    }
}