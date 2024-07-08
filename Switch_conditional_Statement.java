import java.util.Scanner;
public class SecondClass {
 public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  System.out.println("Enter the number in week ");
  int days_in_week=in.nextInt();
  switch(days_in_week){
   case 1:
    System.out.println("Monday is working day");break;
   case 2:
    System.out.println("Tuesday is working day");break;
   case 3:
    System.out.println("Wednesday is working day");break;
   case 4:
    System.out.println("Thursday is working day");break;
   case 5:
    System.out.println("Friday is working day");break;
   case 6:
    System.out.println("Saturday is working day");break;
   case 7:
    System.out.println("Sunday is working day");break;
   default:
    System.out.println("Enter value is either out of the boundary or invalid");

  }
 }
}