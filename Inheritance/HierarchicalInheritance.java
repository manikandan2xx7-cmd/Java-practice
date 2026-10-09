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
        super(name,age);
    }
    void writecode(){
        System.out.println(name+"is writing code");
    }
}
class Testor extends Employee{
    Testor(String name,int age){
        super(name, age);
    }
    void testsoftware(){
        System.out.println(name+"is testing software");
    }
}
class Manager extends Employee{
    Manager(String name,int age){
        super(name, age);
    }
    void manageteam(){
        System.out.println(name+"is managing team");
    }
} 
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter Developer name : ");
        String developername=scanner.nextLine();
        System.out.println("enter Developer age : ");
        int developerage=scanner.nextInt();
        scanner.nextLine();
        Developer developer=new Developer(developername, developerage);
        developer.login();
        developer.writecode();
        developer.logout();
        System.out.println();
        System.out.println("enter Testor name : ");
        String testorname=scanner.nextLine();
        System.out.println("enter Testor age : ");
        int testorage=scanner.nextInt();
        scanner.nextLine();
        Testor testor=new Testor(testorname, testorage);
        testor.login();
        testor.testsoftware();
        testor.logout();
        System.out.println();
        System.out.println("enter Manager name : ");
        String managername=scanner.nextLine();
        System.out.println("enter Manager age : ");
        int managerage=scanner.nextInt();
        scanner.nextLine();
        Manager manager=new Manager(managername, managerage);
        manager.login();
        manager.manageteam();
        manager.logout();
    }
}
