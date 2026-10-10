import java.util.Scanner;
class Student{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
public class GetterSetter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Student student=new Student();
        System.out.println("enter name : ");
        String name=scanner.nextLine();
        System.out.println("enter age : ");
        int age=scanner.nextInt();
        student.setName(name);
        student.setAge(age);
        System.out.println("STUDENT NAME = "+student.getName());
        System.out.println("STUDENT AGE = "+student.getAge());
        scanner.close();
    }
}=
