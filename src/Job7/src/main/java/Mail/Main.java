package Mail;

/*1. Напишите программу, которая заменяет символы в почтовом адресе пользователя:

    @ заменяется на [ at ]
        . заменяется на [ dot ]

            Пример ввода:
        person@gmail.com
            Результат:
        person[ at ]gmail[ dot ].com
                PS: используйте метод split c параметром "," и потом метод trim, чтобы удалить лишние пробелы слева и справа */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter your @mail address: ");
        Scanner scanner = new Scanner(System.in);
        String mail = scanner.next();

        System.out.println("Your @mail address after conversion is: " + mail.replace("@", "[ at ]").replace(".", "[ dot ]"));

    }
}
