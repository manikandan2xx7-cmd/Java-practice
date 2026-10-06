import java.util.Scanner;
public class IncrementDecrement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number : ");
        int num=scanner.nextInt();
        System.out.println("ORIGINAL VALUE = "+num);
        num++;
        System.out.println("AFTER INCREMENT = "+num);
        num--;
        System.out.println("AFTER DECREMENT = "+num);
        scanner.close();
    }
}
