package Assignment1;

import java.util.Scanner;

public class Answer9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float timeSeconds;
        float mps;
        float kph;
        float mph;
        System.out.print("Enter distance in meters: ");
        float distance = scanner.nextFloat();
        System.out.print("Enter hour: ");
        float hour = scanner.nextFloat();
        System.out.print("Enter minutes: ");
        float minute = scanner.nextFloat();
        System.out.print("Enter seconds: ");
        float second = scanner.nextFloat();
        timeSeconds = (hour * 3600) + (minute * 60) + second;
        mps = distance / timeSeconds;
        kph = (distance / 1000.0f) / (timeSeconds / 3600.0f);
        mph = kph / 1.609f;
        System.out.println("Your speed in meters/second is " + mps);
        System.out.println("Your speed in km/h is " + kph);
        System.out.println("Your speed in miles/h is " + mph);
        scanner.close();
    }
}