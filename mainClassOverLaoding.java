public class SecondClass {
    int x,y;
    String a1,a2;
    void main(int x){
        System.out.println(x);
    }
    void main(double y){
        System.out.println(y);
    }
    void main(String a1,String a2){ //these is a main Method with string parameters

    }
    void display(){ //these is an display Method
        System.out.println(x);
        System.out.println(y);
        System.out.println(a1+","+a2);
    }
    public static void main(String[] args) { //Here is args is not the fixed value it is just an another parameter the system Read these Main Method only
    SecondClass sc=new SecondClass();
    sc.main(100);
    sc.main(111.22);
    sc.main("Vassi","rassi");
    sc.display();
    }
}
