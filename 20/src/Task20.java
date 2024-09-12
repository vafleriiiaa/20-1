import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введи целое число: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }
        if (sum == originalNumber) {
            System.out.println("Это число Армстронга");
        } else {
            System.out.println("Это число НЕ число Армстронга");
        }
    }
}