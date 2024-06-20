class Student{
    String name;
    int age;
    double height;
    Student(){ // default constructor
        name="vassi";
        age=10;
        height=98.10;
    }

}
public class SecondClass {
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.height);
    }
}
