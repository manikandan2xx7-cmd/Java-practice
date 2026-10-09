import java.util.Scanner;
class Employee{
    String name;
    int age;
    Employee(String name,int age){
        this.name=name;
        this.age=age;
    }
    void work(){
        System.out.println("Employee is working");
    }
}
class Developer extends Employee{
    Developer(String name,int age){
        super(name, age);
    }
    void work(){
        System.out.println(name + " is writing code");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Developer developer=new Developer("Mani",19);
        System.out.println("NAME : "+developer.name);
        System.out.println("AGE : "+developer.age);
        developer.work();
        scanner.close();
    }
}
