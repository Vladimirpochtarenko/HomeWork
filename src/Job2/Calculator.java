package Job2;

/*Создайте калькулятор, который выполняет, базовые арифметические операции:
        - умножение;
        - деление;
        - сложение;
        - вычитание;
        - остаток от деления (%)*/

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int a = 0, b = 0, result = 0;
        String operation;
        Scanner scanner = new Scanner(System.in);

                a = scanner.nextInt();

        System.out.println("operation");
        operation = scanner.next();

                b = scanner.nextInt();

        switch (operation) {
            case "multiply":
                result = a * b;
                break;
            case "divide":
                result = a / b;
                break;
            case "add":
                result = a + b;
                break;
            case "subtract":
                result = a - b;
                break;
            default:
                System.out.println("error");
        }

        System.out.println("Result: " + result);


    }
}
