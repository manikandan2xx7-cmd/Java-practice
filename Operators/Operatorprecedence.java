import java.util.Scanner;
public class Operatorprecedence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number : ");
        int a= scanner.nextInt();
        System.out.println("enter second number : ");
        int b=scanner.nextInt();
        System.out.println("enter third number : ");
        int c=scanner.nextInt();
        int result=a+b*c;
        System.out.println("RESULT = "+result);
    }
}
