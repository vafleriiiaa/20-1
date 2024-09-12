import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи строку: ");
        String inputString = scanner.nextLine();
        String reversedString = new StringBuilder(inputString).reverse().toString();
        if (inputString.equals(reversedString)) {
            System.out.println("Строка палиндром");
        } else {
            System.out.println("Строка точно не палиндром");
        }
    }
}

