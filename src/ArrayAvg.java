import java.util.Scanner;
public class ArrayAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr= new int [5];
        for (int i= 0; i< arr.length; i++){
            System.out.println("enter a element for index"+i+":");
            arr[i]=sc.nextInt();
        }
        int avg=0;
        int sum=0;
        for( int i = 0; i<arr.length; i++){
                sum += arr[i];
                avg=sum/ arr.length;
            }
        System.out.println("sum is "+sum);
        System.out.println("average is "+avg);
        }
    }

