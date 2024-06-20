import java.util.Scanner;
public class SecondClass {
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the Day");
        String Month=in.next();
        switch(Month){
            case "January"  : System.out.print("31 day in a month");   break;
            case "February" : System.out.print("28 day in a month");  break;
            case "March"    : System.out.print("31 day in a month");    break;
            case "April"    : System.out.print("30 day in a month");      break;
            case "May"      : System.out.print("31 day in a month");      break;
            case "June"     : System.out.print("30 day in a month");      break;
            case "July"     : System.out.print("31 day in a month");        break; 
            case "August"   : System.out.print("31 day in a month");      break;
            case "September": System.out.print("30 day in a month");  break;
            case "October"  : System.out.print("31 day in a month");      break;
            case "November" : System.out.print("30 day in a month");   break;
            case "December" : System.out.print("31 day in a month");    break;
        }
    }
}
