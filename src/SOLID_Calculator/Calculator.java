package SOLID_Calculator;

import java.util.Scanner;

public class Calculator {
    public void runApp() {
        boolean isOn = true;

        while (isOn) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Please enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Please enter the second number: ");
            double num2 = scanner.nextDouble();
            System.out.print("Please enter the operational sign of any other to stop: ");
            String operationalSign = scanner.next();

            switch (operationalSign) {
                case "+":
                    Addition add = new Addition();
                    add.setNum1(num1);
                    add.setNum2(num2);
                    add.operation();
                    System.out.printf("Result is: %.1f + %.1f = %.1f\n", num1, num2, add.getResult());
                    break;
                case "-":
                    Subtraction sub =  new Subtraction();
                    sub.setNum1(num1);
                    sub.setNum2(num2);
                    sub.operation();
                    System.out.println("Result is: " + sub.getResult());
                    break;
                case "*":
                    Multiplication mult = new Multiplication();
                    mult.setNum1(num1);
                    mult.setNum2(num2);
                    mult.operation();
                    System.out.println("Result is: " + mult.getResult());
                    break;
                case "/":
                    Division div = new Division();
                    div.setNum1(num1);
                    div.setNum2(num2);
                    div.operation();
                    System.out.println("Result is: " + div.getResult());
                    break;
                default:
                    isOn = false;
            }
        }
    }
}
