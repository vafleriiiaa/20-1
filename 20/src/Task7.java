import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число N: ");
        int n = scanner.nextInt();
        // цикл от N до 1 в обр порядке
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}

