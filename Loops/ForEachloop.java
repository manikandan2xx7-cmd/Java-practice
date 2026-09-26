import java.util.Scanner;
public class ForEachloop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numbers[]=new int[5];
        for(int i=1;i<5;i++){
            System.out.println("enter number"+(i+1)+":");
            numbers[i]=scanner.nextInt();
        }
        System.out.println();
        System.out.println("NUMBERS : ");
        for(int number:numbers){
            System.out.println(number);
        }
    }
}
