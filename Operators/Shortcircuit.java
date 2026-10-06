import java.util.Scanner;
public class Shortcircuit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number : ");
        int a=scanner.nextInt();
        System.out.println("enter second number : ");
        int b=scanner.nextInt();
        System.out.println("RESULT");
        System.out.println("------");
        System.out.println((a>b)&&(a>0));
    }
}
