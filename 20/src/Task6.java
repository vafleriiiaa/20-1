import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        if (number <= 1) {
            // Если число отрицательное, 0 или 1, оно не является простым
            System.out.println("Число не является простым");
        } else {
            boolean isPrime = true;
            // цикл, проверяющий делимость ч на ч от 2 до кв.корня из ч
            for (int i = 2; i * i <= number; i++) { // если ч делится на ч из диапазона, то оно не простое
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            // проверка
            if (isPrime) {
                System.out.println("Число является простым");
            } else {
                System.out.println("Число не является простым");
            }
        }
    }
}
