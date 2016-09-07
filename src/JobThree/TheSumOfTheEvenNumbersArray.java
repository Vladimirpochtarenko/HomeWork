package Job3;

// Найти сумму всех четных и сумму всех нечетных элементов массива

public class TheSumOfTheEvenNumbersArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int sum1 = 0;

        for (int i = 0; i <= array.length; i++) {
            if (i % 2 == 0) {
                sum1 += array[i];
            } else {
                sum += array[i];
            }
            if (i == 9) break;
        }
        System.out.println("Сумма четных чисел равна : " + sum);
        System.out.println("Сумма не четных чисел равна : " + sum1);

    }
}
