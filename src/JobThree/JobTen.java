package Job3;

//  Вывести первые 5 минимальных элементов массива

public class JobTen {

    public static void main(String[] args) {


        int array[] = {-1, -2, -3, -4, -5, 0, 1, 2, 3, 4, 5};

        System.out.println("Первые 5 минимальных элементов массива: " + fiveMin(array));
    }

    public static int[] sotr(int[] a) {
        for (int i = 0; i < a.length; ++i) {
            for (int j = a.length - 1; j > i; --j) {
                if (a[j] < a[j - 1]) {
                    int t = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = t;
                }
            }
        }
        return a;
    }

    public static String fiveMin(int[] a) {
        String s = "";
        int[] sortArray = sotr(a);
        for (int i = 0; i < 5; i++)
            s += sortArray[i] + " ";
        return s;
    }
}










