import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number : ");
        int a=scanner.nextInt();
        System.out.println("enter second number : ");
        int b=scanner.nextInt();
        System.out.println("BITWISE AND = "+(a&b));
        System.out.println("BITWISE OR = "+(a|b));
        System.out.println("BITWISE NOT = "+(a^b));
    }
}
