package Job1;

//Найти минимальное из 3х чисел

public class MinFromThree {

    public static void main(String[] args) {

        int a = 7;
        int b = 5;
        int c = 8;

        if (a < b && a < c) {
            System.out.println("Min: " + a);
        }
        if (b < a && b < c) {
            System.out.println("Min: " + b);
        }
        if (c < a && c < b) {
            System.out.println("Min: " + b);
        }
    }
}
