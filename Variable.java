import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name;
        int age;
        double salary;
        System.out.println("enter your name : ");
        name=scanner.nextLine();
        System.out.println("enter your age : ");
        age=scanner.nextInt();
        System.out.println("enter your salary : ");
        salary=scanner.nextInt();
        System.out.println("DETAILS !!!");
        System.out.println("NAME = "+name);
        System.out.println("AGE = "+age);
        System.out.println("SALARY = "+salary);
    }
}
