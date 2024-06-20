//Area of a hexagon = (6 * s^2)/(4*tan(π/6))

import java.util.Scanner;
public class SecondClass {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the length side of Hexagonal Structure");
        int side =in.nextInt();
        double area =(6*side*side)/(4*Math.tan(Math.PI/6));
        System.out.println("Area of the hexagonal :"+area);
    }
}