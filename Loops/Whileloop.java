import java.util.Scanner;
public class Whileloop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number : ");
        int n=scanner.nextInt();
        int i=2;
        while(i<=n){
            System.out.println(i);
            i=i+2;
        }
    }
}
