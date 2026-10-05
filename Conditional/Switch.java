import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number : ");
        int a=scanner.nextInt();
        System.out.println("enter second number : ");
        int b=scanner.nextInt();
        System.out.println("enter operator : ");
        char operator=scanner.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println(a+"+"+b+"="+(a+b));
                break;
            case '-':
                System.out.println(a+"-"+b+"="+(a-b));
                break;
            case '*':
                System.out.println(a+"-"+b+"="+(a-b));
                break;
            case '/':
                System.out.println(a+"/"+b+"="+(a/b));
                break;
            default :
                System.out.println("SORRY");
        }
    }
}
