import java.util.Scanner;
class Student{
    String name;
    int age;
    double height;
    Student(){
        this.name=name;
        this.age=age;
        this.height=height;
    }
    Student(String name, int age,double height){
        this.name=name;
        this.age=age;
        this.height=height;
    }
void display(){
    System.out.println("Your name :"+name);
    System.out.println("Your age :"+age);
    System.out.println("your height :"+height);
}
}
public class SecondClass {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Student s1=new Student(); //calling the Object
        System.out.println("Enter the name of the Student :");
        s1.name=in.next();
        System.out.println("Enter the age of the Student :");
        s1.age=in.nextInt();
        System.out.println("Enter the height of the Student :");
        s1.height=in.nextDouble();
        s1.display();

        Student s2=new Student(); //creating the obj Default constructor
        System.out.println("Enter the name of the Student :");
        s2.name=in.next();
        System.out.println("Enter the age of the Student :");
        s2.age=in.nextInt();
        System.out.println("Enter the height of the Student :");
        s2.height=in.nextDouble();
        Student St1=new Student(s2.name,s2.age,s2.height); //Parameterised constructor
        s2.display();
    }
}