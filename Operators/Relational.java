import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number : ");
        int a=scanner.nextInt();
        System.out.println("enter second number : ");
        int b=scanner.nextInt();
        System.out.println("EQUAL = "+(a==b));
        System.out.println("NOT EQUAL = "+(a!=b));
        System.out.println("GREATER THAN = "+(a>b));
        System.out.println("LESS THAN = "+(a<b));
        System.out.println("GREATER OR EQUAL = "+(a>=b));
        System.out.println("LESS OR EQUAL = "+(a<=b));
    }
}
