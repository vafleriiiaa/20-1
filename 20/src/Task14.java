import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи размер массива: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Введи элемент массива: ");
            array[i] = scanner.nextInt();
        }
        int maxNumber = array[0];
        for (int i = 1; i < arraySize; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        System.out.println("Макс число в массиве: " + maxNumber);
    }
}

