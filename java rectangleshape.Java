import java.util.Scanner;
class SymbolDesign{
 int i,j,rows,columns;
 String symbol;
 void setDesignData(int rows,int columns, String symbol){
  this.rows=rows;
  this.columns=columns;
  this.symbol=symbol;
 }
 void getDesignCalculation(){

  for(int i=0;i<=rows;i++){
   System.out.println();
   for(int j=0;j<=columns;j++){
    System.out.print(symbol);
   }
  }
 }
}
public class SecondClass {
 public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  SymbolDesign sd=new SymbolDesign();
  System.out.println("Enter the number of rows");
  sd.rows=in.nextInt();
  System.out.println("Enter the number of columns");
  sd.columns=in.nextInt();
  System.out.println("Enter the Symbol");
  sd.symbol=in.next();
  sd.setDesignData(sd.rows,sd.columns,sd.symbol);
  sd.getDesignCalculation();
 }
}