package solid_calculator;

import java.util.Scanner;

public class Calculator implements Input, CalculatorLogic, CalculatorOutput {

    public double getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        return scanner.nextDouble();
    }

    public String getUserOperationInput() {
        Scanner scanner = new Scanner(System.in);
        String[] regex = {"+", "-", "*", "/"};
        String reg = "+-/*";
        System.out.print("Please enter an operator or any other letter to quit (+,-,*,/): ");
        String sign = scanner.next();

        if (!reg.contains(sign)) {
            return "quit";
        }

        return sign;
    }

    public double logic(double num1, double num2, String sign) {
        double result = 0;

        switch (sign) {
            case "+":
                Addition add = new Addition();
                add.setNum1(num1);
                add.setNum2(num2);
                add.operation();
                result = add.getResult();
                break;
            case "-":
                Subtraction sub =  new Subtraction();
                sub.setNum1(num1);
                sub.setNum2(num2);
                sub.operation();
                result = sub.getResult();
                break;
            case "*":
                Multiplication mult = new Multiplication();
                mult.setNum1(num1);
                mult.setNum2(num2);
                mult.operation();
                result = mult.getResult();
                break;
            case "/":
                Division div = new Division();
                div.setNum1(num1);
                div.setNum2(num2);
                div.operation();
                result = div.getResult();
                break;
        }
        return result;
    }

    public void getOutput(double num1, double num2, double result) {
        System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, result);
    }

    public void runApp() {
        boolean isOn = true;

        while (isOn) {

            double num1 = getUserInput();
            double num2 = getUserInput();
            String operationalSign = getUserOperationInput();
            if (operationalSign.equals("quit")) {
                System.out.println("Invalid operator");
                break;
            }
            double result = logic(num1, num2, operationalSign);
            getOutput(num1, num2, result);

        }
    }
}
