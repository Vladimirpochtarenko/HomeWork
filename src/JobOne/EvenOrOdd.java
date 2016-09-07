package Job1;

//Написать программу, которая проверит, является ли число четным или нечетным

public class EvenOrOdd {

    public static void main(String[] args) {

        int a = 5;
        int result;

        if ( (a % 2) == 0 )
                System.out.println(a + " The number is even");
            else
                System.out.println(a + " The number is odd");

    }
}
