package Job3;

/*  Найти все счастливые билеты от 100000 до 999999 :
    билет счастливый если сумма первых трех цифр равна сумме трех последних
    например,123312:1+2+3==3+1+2 */

public class HappyTicket {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 100000; i <= 999999; i++) {
            int number1 = i / 100000;
            int number2 = (i / 10000) % 10;
            int number3 = (i / 1000) % 10;
            int number4 = (i / 100) % 10;
            int number5 = (i / 10) % 10;
            int number6 = i % 10;

            if (number1 + number2 + number3 == number4 + number5 + number6) {
                System.out.println("Счастливый билет под номером: " + i);
            }
        }
    }

}

