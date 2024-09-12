import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введи строку: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }
        System.out.println("слова в обр порядке: " + result.toString().trim());
    }
}
