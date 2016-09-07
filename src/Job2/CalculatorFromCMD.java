package Job2;

/*Тот же калькулятор, только операция и числа вводятся как параметры из командной строки в "Edit Configuration".
        (попробуйте после того как запустили в IDE запустить приложение из консоли с передачей параметров).*/

public class CalculatorFromCMD {

    public static void main(String[] args) {

        int result = 0;

        String operation = args[1];

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);

        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;

        }

        System.out.println("Result: " + result);
    }
}

