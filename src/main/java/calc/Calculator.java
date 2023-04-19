package calc;

public class Calculator {
    // red
    //green
    //refactor
    public int add(int val1, int val2){

        return val1 + val2;
    }
    // subtract
    public int subtract(int val1, int val2){

        return val2 - val1;
    }
    //multiply
    public int multiply(int val1, int val2){
        return val1 * val2;
    }
    // square
    public int square(int val1){
        return val1 * val1;
    }
    //divide
    public int divide(int val1 , int val2){
        return val1 / val2;
    }
    //squareRoot
    public double squareRoot(double val1){
        return Math.sqrt(val1);
    }
    //exponent
    public double exponent(int val1, int val2){
        return Math.pow(val1,val2);
    }
}
