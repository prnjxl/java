import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The entered numbers in the array are:");
        //for each loop
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
