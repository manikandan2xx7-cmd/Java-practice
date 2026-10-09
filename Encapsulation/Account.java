import java.util.Scanner;
class BankAccount{
    String name;
    private int balance;
    BankAccount(String name, int balance){
        this.name=name;
        this.balance=balance;
    }
    public void showbalance(){
        System.out.println("NAME = "+name);
        System.out.println("BALANCE = "+balance);
    }
}
public class Account {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter Account Holder name : ");
        String name=scanner.nextLine();
        System.out.println("enter Account balance : ");
        int balance=scanner.nextInt();
        BankAccount account=new BankAccount(name, balance);
        account.showbalance();
        scanner.close();
    }
}
