import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your age : ");
        int age=scanner.nextInt();
        if(age>=18){
            System.out.println("ELIGIBLE");
        }
        else{
            System.out.println("NOT ELIGIBLE");
        }
    }
}
