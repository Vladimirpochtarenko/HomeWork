package Job4;

/* Создайте функцию, которая заполняет 2-мерный массив треугольником Паскаля (элемент, который на
строчке ниже, равен сумме 2х верхних элементов, которые стоят рядом; по бокам стоят единицы) */

import java.util.Scanner;

public class Pascal {

    public static void main(String[] args) {

        int i = 0;
        System.out.print("Введите количество строк : ");

        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();
        scanner.close();

        int[][] array = new int[i][];
        array[0] = new int[1];
        array[1] = new int[2];
        array[1][0] = array[1][1] = 1;
        System.out.println(array[0][0] = 1);
        System.out.println(array[1][0] + " " + array[1][1]);
        for (int j = 2; j < i; j++) {
            array[j] = new int[j + 1];
            System.out.print((array[j][0] = 1) + " " );
            for (int k = 1; k < j; k++) {
                System.out.print((array[j][k] = array[j - 1][k - 1] + array[j - 1][k]) + " ");


            }
            System.out.println(array[j][j] = 1);
        }


    }
}
