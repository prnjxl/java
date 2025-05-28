import java.util.*;

public class loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //this is an example of for loop
        System.out.println("Number from 1 to 5");
        int i;
        for(i=0;i<=5;i++){
            System.out.print((i+1)+" ");
        }
        System.out.println();
        //this is the example of while loop
        System.out.println("Right Triangle Patter");
        int j=0;
        while(j<5){
            int k=0;
            while(k<=j){
               System.out.print("*");
               k++;
            }
            System.out.println();
            j++;
        }
        //this is an example of do while loop
        System.out.println("Enter the number");
        int x= sc.nextInt();
        int fact=1;
        System.out.println("Factorial of "+x);
        do{
            fact=fact*x;
            x--;
        }while(x!=0);
        System.out.println(fact);
    }
}
