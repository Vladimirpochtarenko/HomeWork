package Job2;

/*Добавить к калькулятору возможность ввода операции и чисел из консоли.
В начале выводите сообщение "Введите операцию:", дальше пользователь
вводит операцию, далее "Введите первое число:" - вводит, "Введите второе число:
" - пользователь вводит.*/

    import java.util.Scanner;

public class CalculatorAddFunction {

        public static void main(String[] args) {


            int a = 0;
            int b = 0;
            int result = 0;

            String operation;
            Scanner scanner  = new Scanner(System.in);

            System.out.print("Введите первое число:");
            a = scanner.nextInt();

            System.out.print("Укажите операцию (Умножение, Деление, Сумма, Вычитание):");
            operation = scanner.next();

            System.out.print("Введите второе число:");
            b = scanner.nextInt();

            switch (operation) {
                case "Умножение":
                    result = a * b;
                    break;
                case "Деление":
                    result = a / b;
                    break;
                case "Сумма":
                    result = a + b;
                    break;
                case "Вычитание":
                    result = a - b;
                    break;
                default:
                    System.out.println("Ошибка");
            }

            System.out.println("Ваш результат: " + result);
        }
    }

