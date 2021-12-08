package function;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        String result = odd(num);
}
private static String odd(int num){
    if(num%2==0){
        return "the number is even."+num;
    }else{
        return "The number is odd."+num;
    }
    }
}
