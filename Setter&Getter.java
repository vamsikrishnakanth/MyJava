import java.util.Scanner;
class Student{
    private String studentName;
    private int studentage;
    private double studentHeight;

    String sTudentName(){  // when private is given to the local variable we need to create a method to accesses this variable
        return studentName;
    }
    int sTudentAge(){
        return studentage;
    }
    double sTudentHeight(){
        return studentHeight;
    }

    void setStudentData(String name,int age,double height){ //in Encapsulation we use the set and getter "set" Method is used to assign the values to the variable
        studentName=name;
        studentage=age;
        studentHeight=height;
    }
    void getStudentData(){ //in Encapsulation after assigning the value by setter , then we use "get" method to get the values.
        System.out.println("Student name "+studentName);
        System.out.println("Student age "+studentage);
        System.out.println("Student Height "+studentHeight);
    }
}
public class SecondClass {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Student st=new Student();
        String x=st.sTudentName(); //we need to create a new variable for the described methods by using the String, int,Double
        int y=st.sTudentAge();
        double z=st.sTudentHeight();
        System.out.println("Enter the Student name");
        x=in.next(); //reassign the local variable
        System.out.println("Enter the Student Age");
        y=in.nextInt();
        System.out.println("Enter the Student Height");
        z=in.nextDouble();
        st.setStudentData(x,y,z);
        st.getStudentData();
    }
}
