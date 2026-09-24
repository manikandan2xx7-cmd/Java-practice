import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number : ");
        int a=scanner.nextInt();
        System.out.println("enter second number : ");
        int b=scanner.nextInt();
        System.out.println();
        System.out.println("ADDITION = "+(a+b));
        System.out.println("SUBSTRACTION = "+(a-b));
        System.out.println("MULTIPLICATION = "+(a*b));
        System.out.println("DIVISION = "+(a/b));
    }
}
