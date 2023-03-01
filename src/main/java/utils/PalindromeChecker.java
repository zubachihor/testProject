package utils;

import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Перевіряємо, що введена строка складається тільки з літер
        if (!input.matches("[a-zA-Z]+")) {
            System.out.println("Input should contain only letters");
            return;
        }

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        // Переводимо строку до нижнього регістру та видаляємо зайві символи
        String cleanStr = str.toLowerCase().replaceAll("[^a-zA-Z]", "");

        // Перевертаємо строку
        String reversedStr = new StringBuilder(cleanStr).reverse().toString();

        // Порівнюємо перевернуту строку з оригінальною
        return cleanStr.equals(reversedStr);
    }
}
