package SOLID_Calculator;

public class Subtraction implements CalculatorOperation {
    private double num1;
    private double num2;
    private double result;

    @Override
    public void operation() {
        result = num1 - num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResult() {
        return result;
    }
}

