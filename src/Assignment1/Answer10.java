package Assignment1;
import java.util.Scanner;
public class Answer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int number;
        int temp;
        int total = 0;
        System.out.println("Enter any number");
        num= sc.nextInt();
        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}
