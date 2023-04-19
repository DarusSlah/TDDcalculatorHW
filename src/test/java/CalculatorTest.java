import calc.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    // red, green, refactor
    @Test
    public void addTest(){
        // given
        Calculator calculator = new Calculator();
        int val1 = 7;
        int val2 = 10;
        int expected = val1 + val2;

        // when

        int actual = calculator.add(val1, val2);

        // then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void subtractTest(){
        Calculator calculator = new Calculator();
        int val1 = 7;
        int val2 = 10;
        int expected = val2 - val1;

        int actual = calculator.subtract(val1, val2);

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void multiplyTest(){
        Calculator calculator = new Calculator();
        int val1 = 6;
        int val2 = 5;
        int expected = val1 * val2;

        int actual = calculator.multiply(val1,val2);

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void squareTest(){
        Calculator calculator = new Calculator();
        int val1 = 25;
        int expected = val1 * val1;

        int actual = calculator.square(val1);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void divideTest(){
        Calculator calculator = new Calculator();
        int val1 = 100;
        int val2 = 25;
        int expected = val1 / val2;

        int actual = calculator.divide(val1,val2);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void squareRootTest(){
        Calculator calculator = new Calculator();
        double val1= 100;
        double expected = Math.sqrt(val1);

        double actual = calculator.squareRoot(val1);

        Assert.assertEquals(expected,actual,0.001);
    }
    @Test
    public void exponentTest(){
        Calculator calculator = new Calculator();
        int val1 = 10;
        int val2 = 4;
        double expected = Math.pow(val1,val2);

        double actual = calculator.exponent(val1,val2);

        Assert.assertEquals(expected,actual,.0001);
    }
}
