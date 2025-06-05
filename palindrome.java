//this is a program to find the palindrome number
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalnum = num;
        int reversednum = 0,remainder;
        while(num != 0){
            remainder= num % 10;
            reversednum = reversednum * 10 + remainder;
            num /= 10;
        }
        if(originalnum == reversednum){
            System.out.println("The number is a palindrome number");
        }
        else{
            System.out.println("The number is not a palindrome number");
        }
    }
}
