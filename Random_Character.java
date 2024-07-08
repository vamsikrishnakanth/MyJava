import java.util.Random;
import java.util.Scanner;
public class SecondClass{
    public static void main(String[] args) {
        //Creating a String for all Characters
        String alphabet="ABCDEFGHIJKLMOPQRSTUVWXYZ";

        //Creating random String Builder
        StringBuilder sb=new StringBuilder();

        //creating an object of Random String
        Random random=new Random();

        //creating an object for Scanner class to enter the Required length of Random string
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Length of the random string ");

       //Specify length of random String
        int length=in.nextInt();
        for (int i=0;i<length; i++){
            //generating the Random Index
            int index =random.nextInt(alphabet.length());

            //get character specified by index from string
            char randomChar=alphabet.charAt(index);

            //append the character to String builder
            sb.append(randomChar);

        }
    String randomString=sb.toString();
        System.out.println("Random String is :"+randomString);
    }
}