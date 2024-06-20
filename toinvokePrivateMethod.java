import java.util.Scanner;
class Student{
 private int age; 
 private double height; 
 private String name;
    void Student(String myName, int myage, double studentheight) {
        this.name = myName;
        this.age = myage;
        this.height=studentheight;
    }
    String Name(){ //Creating an method to call the "private String name"
        return name;
    }
    int Age(){      //creating an Method to call the "private int age"
        return age;
    }
    double Height(){ //creating an method to call the "private double height"
        return height;
    }
    public void display() {
        System.out.println("Name of student:"+name);
        System.out.println("Age of the Student:"+age);
        System.out.println("Height of the student:"+height);
    }
}
public class SecondClass {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Student st=new Student(); //creating an object to call the class
        System.out.println("enter the Name of the student:");
        String studentName=st.Name(); //creating an variable to call the private name Method "st.Name"
        studentName=in.next();
        System.out.println("Enter the Age of the student:");
        int studentAge=st.Age();
        studentAge= in.nextInt();
        System.out.println("Enter the Height of the student:");
        double studentheight=st.Height();
        studentheight=in.nextFloat();
        st.Student(studentName,studentAge,studentheight);
        st.display();
    }
}
