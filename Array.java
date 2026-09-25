import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numbers[]=new int[5];
        int total=0;
        for(int i=0;i<5;i++){
            System.out.println("enter number "+(i+1)+":");
            numbers[i]=scanner.nextInt();
            total=total+numbers[i];
        }
        int average=total/5;
        System.out.println();
        System.out.println("TOTAL = "+total);
        System.out.println("AVERAGE = "+average);
    }
}
