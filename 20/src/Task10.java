import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        int countDigits = 0;
        if (number == 0) {
            countDigits = 1;
        } else {
            while (number != 0) {
                number /= 10;
                countDigits++;
            }
        }
        System.out.println("Количество цифр в числе: " + countDigits);
    }
}
