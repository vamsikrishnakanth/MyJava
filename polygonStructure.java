import java.io.*;
import java.util.Scanner;

class polygonStructure{
    int x1,x2,y1,y2;
    double radius=6371.01; // in KM //object reference variable.
    void polygonStructureData(int x1Side,int x2Side,int y1Side,int y2Side) { //Parameters with no Return values.
        this.x1 = x1Side;
        this.x2 = x2Side;
        this.y1 = y1Side;
        this.y2 = y2Side;

    }
        void polygonStructureCalc(){
        double distanceTwopoints =radius*(((Math.sin(x1)*Math.sin(x2))+(Math.cos(y1)*Math.cos(y2)))*Math.cos(y1-y2));
            System.out.println("Distance between two points on the Earth :"+distanceTwopoints);
    }

}
public class SecondClass {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        polygonStructure pData= new polygonStructure();
        System.out.println("Enter the number of side of polygon Structure");
        pData.x1=in.nextInt();
        System.out.println("Enter the length side of polygon Structure");
        pData.x2=in.nextInt();
        System.out.println("Enter the number of side of polygon Structure");
        pData.y1 =in.nextInt();
        System.out.println("Enter the length side of polygon Structure");
        pData.y2=in.nextInt();
        pData.polygonStructureData(pData.x1, pData.x2, pData.y1, pData.y2 );
        pData.polygonStructureCalc();

    }
}