import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи размер  массива: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        int sum = 0;
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Введи элемент массива: ");
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        System.out.println("Сумма всех эл-ов массива: " + sum);
    }
}
