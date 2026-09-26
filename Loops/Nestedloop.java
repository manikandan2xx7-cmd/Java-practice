import java.util.Scanner;
public class Nestedloop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number of tables : ");
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+"x"+j+"="+(i*j));
            }
            System.out.println();
        }
    }
}
