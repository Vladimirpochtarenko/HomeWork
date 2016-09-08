package CalcTest;

public class Calculator {

    public static void main(String[] args) {

        int result = addition(5, 7);
        int result2 = substruction(10, 4);
        int result3 = division(10, 5);
        int result4 = multiplication(2, 2);

        System.out.println("Result addition is : " + result);
        System.out.println("Result substraction is : " + result2);
        System.out.println("Result division is : " + result3);
        System.out.println("Result multiplication is : " + result4);
    }

    public static int addition(int oper1, int oper2) {
        return oper1 + oper2;
    }

    public static int substruction(int oper1, int oper2) {
        return oper1 - oper2;
    }

    public static int division(int oper1, int oper2) {
        return oper1 / oper2;
    }

    public static int multiplication(int oper1, int oper2) {
        return oper1 * oper2;
    }
}
