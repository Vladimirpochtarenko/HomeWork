package CalcTest;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {

    @Test
    public void testAddition() {
        int oper1 = 7;
        int oper2 = 5;
        int actualResult = Calculator.addition(oper1, oper2);

        Assert.assertEquals("The result was wrong", 12, actualResult);
    }

    @Test
    public void testSubstraction() {
        int oper1 = 10;
        int oper2 = 4;
        int actualResult = Calculator.substruction(oper1, oper2);

        Assert.assertEquals("The result in wrong", 6, actualResult);
    }

    @Test
    public void testDivision() {
        int oper1 = 10;
        int oper2 = 5;
        int actualResult = Calculator.division(oper1, oper2);

        Assert.assertEquals("Test result is wrong", 2, actualResult);
                    }

    @Test
    public void testMultiplication() {
        int oper1 = 2;
        int oper2 = 2;
        int actualResult = Calculator.multiplication(oper1, oper2);

        Assert.assertEquals("The result is wrong", 4, actualResult);
    }


}
