package Job3;

// Перевести число в двоичную систему счисления

import java.util.Scanner;

public class BinarySystem {

    public static void main(String[] args) {

        System.out.print("Введите число: ");

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String bin = "";
        while (n > 0) {
            bin = (n % 2) + bin;
            n /= 2;
        }
        System.out.println("Ваше число в двоичной системе имеет вид: " + bin);
    }
}


