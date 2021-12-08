package Assignment1;
import java.util.Scanner;
public class Answer1 {
    public static void main(String[] args) {
        int num;
        int prime;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        num = sc.nextInt();
        for(int i = 2; i<num; i++){
            prime = 0;
            for(int j = 2 ; j<i; j++){
                if (i% j == 0)
                    prime = 1;

            }
            if (prime == 0)
                System.out.println(i);
        }
    }
}
