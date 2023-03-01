package utils;

import java.util.Random;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        int length = 12;
        System.out.println("Your random password is: " + generatePassword(length));
    }

    public static String generatePassword(int length) {
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String combinedChars = upperCaseLetters + lowerCaseLetters + numbers;
        Random random = new Random();
        char[] password = new char[length];

        // Генеруємо пароль і перевіряємо, чи містить він букви верхнього та нижнього регістрів та цифри.
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;
        for (int i = 0; i < length; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
            if (Character.isUpperCase(password[i])) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(password[i])) {
                hasLowerCase = true;
            } else if (Character.isDigit(password[i])) {
                hasNumber = true;
            }
        }

        // Якщо пароль не містить букви верхнього регістру, букви нижнього регістру або цифри, генеруємо новий пароль.
        if (!hasUpperCase || !hasLowerCase || !hasNumber) {
            return generatePassword(length);
        }

        return new String(password);
    }
}
