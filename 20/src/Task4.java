import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // ввод пользака
        System.out.print("Введите целое число N: "); // вывод сообщения
        int n = scanner.nextInt(); // считываем число
        int sum = 0;
        for (int i = 1; i <= n; i++) {  //цикл от 1 до N
            sum += i; // + текущее число i к сумме
        }
        System.out.println("Сумма чисел от 1 до " + n + ": " + sum);
    }
}

