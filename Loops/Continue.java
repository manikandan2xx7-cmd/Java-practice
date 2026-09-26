import java.util.Scanner;
public class Continue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number : ");
        int n=scanner.nextInt();
        for(int i=1;i<5;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
