import java.util.Scanner;

public class functions {
    public int sum(int x, int y){
        return x+y;
    }
    public void display(){
        System.out.println("Hello World");
    }
    public static void main(String[] args){
        functions obj=new functions();
        Scanner sc=new Scanner(System.in);
        obj.display();
        System.out.println("Enter the numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Sum of two numbers are : "+obj.sum(a,b));
    }
}
