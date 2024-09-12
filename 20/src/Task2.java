import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Введите третье целое число: ");
        int thirdNumber = scanner.nextInt();
        int minimumNumber = firstNumber; // типа 1-е число - мин
        if (secondNumber < minimumNumber) {
            minimumNumber = secondNumber;
        }
        if (thirdNumber < minimumNumber) {
            minimumNumber = thirdNumber;
        }
        System.out.println("Минимальное число: " + minimumNumber);
    }
}

