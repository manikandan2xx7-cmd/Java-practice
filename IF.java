import java.util.Scanner;

public class IF {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter salary : ");
        int salary=scanner.nextInt();
        if(salary>25000){
            System.out.println("ELIGIBLE");
        }
    }
}
