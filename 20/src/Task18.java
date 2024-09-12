import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введи строку: ");
        String inputString = scanner.nextLine().toLowerCase();
        int vowelCount = 0;
        int consonantCount = 0;
        for (char character : inputString.toCharArray()) {
            if ("aeiouаеёиоуыэюя".indexOf(character) != -1) {
                vowelCount++;
            } else if (Character.isLetter(character)) {
                consonantCount++;
            }
        }
        System.out.println("Гласных: " + vowelCount);
        System.out.println("Согласных: " + consonantCount);
    }
}

