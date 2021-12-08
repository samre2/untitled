package Assignment1;
import java.util.Scanner;
public class Answer3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[]arr;
        arr = new int[5];
        for( int i = 0; i< arr.length; i++){
            System.out.println("enter a element for index"+i+":");
            arr[i]=sc.nextInt();
        }
        System.out.println("arry element are : ");
        int sum=0;
        for( int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);

    }
}
