// Creates a FileReader
//FileReader file = new FileReader(String file);

// Creates a BufferedReader
//BufferedReader buffer = new BufferedReader(file);

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
public class SecondClass {
    public static void main(String[]args) throws IOException{
        InputStreamReader IR =new InputStreamReader(System.in);
        BufferedReader bf= new BufferedReader(IR);
        System.out.print("Enter the name :");
        String str =bf.readLine();
        System.out.println("Enter the number");
        int x=Integer.parseInt(bf.readLine());
        System.out.println("Enter the Second  number");
        int y=Integer.parseInt(bf.readLine());
        int z=x+y;
        System.out.println("Addition of number"+z);
    }
}