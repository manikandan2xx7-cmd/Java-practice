import java.util.Scanner;

public class Forloop{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number : ");
        int n=scanner.nextInt();
        for(int i=1;i<10;i++){
            System.out.println(i+"x"+n+"="+(i*n));
        }
    }
}
