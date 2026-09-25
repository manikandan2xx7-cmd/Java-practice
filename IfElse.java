import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your age : ");
        int age=scanner.nextInt();
        if(age>=18){
            System.out.println("ELIGIBLE FOR VOTE !!!");
        }
        else{
            System.out.println("NOT ELIGIBLE FOR VOTE");
        }
    }
}
