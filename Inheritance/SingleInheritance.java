import java.util.Scanner;
class Employee{
    String name;
    int age;
    Employee(String name,int age){
        this.name=name;
        this.age=age;
    }
    void login(){
        System.out.println(name+"logged in");
    }
    void logout(){
        System.out.println(name+"logged out");
    }
}
class Developer extends Employee{
    Developer(String name,int age){
        super(name, age);
    }
    void writecode(){
        System.out.println(name+"is writing code");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter name : ");
        String name=scanner.nextLine();
        System.out.println("enter age : ");
        int age=scanner.nextInt();
        scanner.nextLine();
        Developer developer=new Developer(name, age);
        developer.login();
        developer.writecode();
        developer.logout();
    }
}

