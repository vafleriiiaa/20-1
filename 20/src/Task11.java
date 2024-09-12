import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner сканер = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int число = сканер.nextInt();
        int факториал = 1;
        for (int i = 1; i <= число; i++) {
            факториал *= i;
        }
        System.out.println("Факториал числа " + число + " равен " + факториал);
    }
}

