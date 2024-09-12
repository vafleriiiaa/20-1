import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи размер массива: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        int positiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Введи элемент массива: ");
            array[i] = scanner.nextInt();
            if (array[i] > 0) {
                positiveCount++;
            } else if (array[i] < 0) {
                negativeCount++;
            }
        }
        System.out.println("Положительных чисел: " + positiveCount);
        System.out.println("Отрицательных чисел: " + negativeCount);
    }
}
