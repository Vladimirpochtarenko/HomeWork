package Job1;

// Найти среди 3х чисел максимальное и минимальное

public class MinAndMaxFromThree {


    public static void main(String[] args) {

        int a = 7;
        int b = 5;
        int c = 8;

        if (a < b && a < c) {
            System.out.println("Min: " + a + "");
        }
        if (b < a && b < c) {
            System.out.println("Min: " + b + "");
        }

        if (c < a && c < b) {
            System.out.println("Min: " + b + "");
        }
        if (a > b && a > c) {
            System.out.println("Max: " + a + "");
        }

        if (b > a && b > c) {
            System.out.println("Max: " + b + "");
        }

        if (c > a && c > b) {
            System.out.println("Max: " + b + "");
        }
    }
}


