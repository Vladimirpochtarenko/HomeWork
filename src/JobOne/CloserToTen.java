package Job1;

// Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11

public class CloserToTen {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = 10;

        int d = Math.abs(c - a);
        int e = Math.abs(c - b);
                if (d > e) {
            System.out.println("Number " + b + " closer to " + c);
        }
        if (d < e) {
            System.out.println("Number " + a + " closer to " + c);
        }

    }
}
