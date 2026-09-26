import java.util.Scanner;
public class Break {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number : ");
        int n=scanner.nextInt();
        for(int i=1;i<=5;i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
    }
}
