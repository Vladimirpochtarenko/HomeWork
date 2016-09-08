package Job5;

import java.util.Arrays;

public class FirstInSix {

    public static void main(String[] args) {

        int[] a = { 2 , 3 , 10 , 12 };
        int[] b = { 1 , 5 , 8 , 9 };
        int[] c = new int[a.length + b.length];

        for (int i = 0; i < c.length / 2; i++) {
            if (a[i] > b[i]) {
                c[i + i] = b[i];
                c[i + i + 1] = a[i];
            } else {
                c[i + i] = a[i];
                c[i + i + 1] = b[i];

            }

        }

        for (int i = 0; i < c.length - 1; i++) {
            int t = c[i];
            if (c[i] > c[i + 1]) {
                c[i] = c[i + 1];
                c[i + 1] = t;
            }

        }

        System.out.println(Arrays.toString(c));
    }
}