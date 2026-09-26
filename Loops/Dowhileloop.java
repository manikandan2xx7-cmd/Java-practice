import java.util.Scanner;

public class Dowhileloop{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number : ");
        int n=scanner.nextInt();
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}
