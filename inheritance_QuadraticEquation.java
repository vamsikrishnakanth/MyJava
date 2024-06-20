//Inheritance:
import java.util.Scanner;
class qudraticEquation{
    int a,b,c;
    double result,r1,r2;
    void quadraticInputData(int a,int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
        result=(b*b-(4*a*c));
        System.out.println("Result :"+result);

    }
    void resultLessthanZero(int a,int b, int c){
             //result>0
        r1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
        r2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
        System.out.println("Roots of the Quadratic Equation :"+r1+","+r2);
    }

    void resultEqualzero(int a,int b, int c){ // we are adding the Data to variables through  creating a Special Method.
        r1= (-b/2*a);
        System.out.println("Roots of the Quadratic Equation"+r1);
    }
    String resultHaveNoRoots(){
        return("Have no Roots for Quadratic Equation");
    }
}
