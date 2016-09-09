package Polindrom;

/*3. Определить является ли слово палиндромом, т.е. читается одинаково, слева направо и справа налево.
        Определить количество таких слов в тексте, в котором все слова введены через запятую.

        Пример ввода:
        deleveled, evitative, cat, dog, deified
        Результат:
        There are 3 palindromes in the text*/

import java.lang.ref.SoftReference;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter the words to check for polindrom: ");
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        int number = 0;

        String[] arr_words = words.split(",");
        for (int i = 0; i < arr_words.length; i++) {
            arr_words[i] = arr_words[i].trim();
            if (palindrom(arr_words[i]))
                number++;
        }

        System.out.println("You have " + number + " palindrom words in the text");

    }

    private static boolean palindrom(String n) {
        for (int i = 0; i <= n.length() >> 1; i++) {
            if (n.charAt(i) != n.charAt(n.length() - 1 - i)) {
                return false;
            }

        }
        return true;
    }
}
