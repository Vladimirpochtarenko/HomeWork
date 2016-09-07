package Job1;

//Найти минимальное из 3х чисел, причем, если минимальных несколько вывести все такие числа

public class MinFromTheeIfMinTwo {

    public static void main(String[] args) {

        int a = 5;
        int b = 5;
        int c = 5;

        if (a <= b && a <= c) {
            System.out.println("Min: " + a + "");
        }
        if (b <= a && b <= c) {
            System.out.println("Min: " + b + "");
        }

        if (c <= a && c <= b) {
            System.out.println("Min: " + b + "");
        }

    }
}
