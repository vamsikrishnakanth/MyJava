//Buffered Reader
import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SecondClass {
   static String studentName;
   static int age;
   static double height;
    void display(){
        System.out.println(studentName);
        System.out.println(age);
        System.out.println(height);
    }
    public static void main(String[] args)  throws Exception {
        SecondClass sc=new SecondClass();
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        System.out.println("enter the Student name");
        studentName=br.readLine();
        System.out.println("Enter the Student age");
        age=Integer.parseInt(br.readLine());
        System.out.println("Enter the Height age");
        height=Double.parseDouble(br.readLine());
        sc.display();
    }
}