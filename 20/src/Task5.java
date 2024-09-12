import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число N: ");
        int n = scanner.nextInt();
        // инициал-я первы двух чисел Фибоначчи
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.print(firstNumber + " " + secondNumber + " ");
        for (int i = 2; i < n; i++) { // цикл выполняется 2 раза (первые два числа уже выведены)
            int nextNumber = firstNumber + secondNumber; // вычисляем следу.число Фибоначчи, складывая два пред
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}

