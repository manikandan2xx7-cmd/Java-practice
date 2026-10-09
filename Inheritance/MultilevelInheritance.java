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
class seniorDeveloper extends Developer{
    seniorDeveloper(String name,int age){
        super(name, age);
    }
    void leadproject(){
        System.out.println(name+"is leading the project");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter employee name : ");
        String name=scanner.nextLine();
        System.out.println("enter employee age : ");
        int age=scanner.nextInt();
        scanner.nextLine();
        seniorDeveloper seniorDeveloper=new seniorDeveloper(name, age);
        seniorDeveloper.login();
        seniorDeveloper.writecode();
        seniorDeveloper.leadproject();
        seniorDeveloper.logout(); 
    }
}

