package Job3;

//Найти минимальный и максимальный элемент массива

public class MinAndMaxInArray {

    public static void main(String[] args) {

        int[] array = {1, 12, 3, 323, 58, 65, 74, 82, 19};

        System.out.println("Первые 5 минимальных элементов массива: " + fiveMin(array));
    }
    public static int[] sotriroka(int[] a) {
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
        int[] sortArray = sotriroka(a);
        for (int i = 0; i < 5; i++)
            s += sortArray[i] + " ";
        return s;
    }
}





