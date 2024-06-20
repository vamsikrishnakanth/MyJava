//parameterised and default constructor

class Student{
    String name;
    int age;
    double height;
Student(){ // default constructor
    name="vassi";
    age=10;
    height=98.10;
}
Student(String name,int age ,double height){ // Parameterised Constructor 
    this.name=name;
    this.age=age;
    this.height=height;
}
}
public class SecondClass {
    public static void main(String[] args) {
        Student s1=new Student(); //creating a new object
        Student s2=new Student("mahi",10,96.119); //crating second object
        System.out.println(s1.age); 
		System.out.println(s1.name);
		System.out.println(s1.height);

        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.height);
    }
}
