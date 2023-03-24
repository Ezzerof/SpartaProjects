package Calculator;

import java.util.Scanner;

public class Calculator {

    public static int Add(int a, int b) {
        return a + b;
    }

    public static double Add(double a, double b) {
        return a + b;
    }

//    public static int Subtract(int a, int b) {
//        return a - b;
//    }

    public static double Subtract(double a, double b) {
        return a - b;
    }

//    public static int Multiply(int a, int b) {
//        return a * b;
//    }

    public static double Multiply(double a, double b) {
        return a * b;
    }

    public static double Divide(double a, double b) {
        return a / b;
    }

    public static void RunCalc() {
        boolean isOn = true;
        while (isOn) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your exercise, can be used only one operation (e.g. 1 + 2): ");
            String calc = scanner.nextLine();
            System.out.println("Your result is: " + Converter(calc));
            System.out.print("\nDo you want to continue? (Yes / No): ");
            String flag = scanner.next();

            if (flag.equalsIgnoreCase("no") || flag.equalsIgnoreCase("n"))
                isOn = false;

        }
    }

    public static double Converter(String text) {

        String convertedText = text.replace(" ", "");
        char[] regex = {'*', '/', '+', '-'};
        String operator = "";
        int index = 0;

        for (int i = 0; i < convertedText.length(); i++) {
            char c = convertedText.charAt(i);
            for (int j = 0; j < regex.length; j++) {
                if (c == regex[j]) {
                    operator = c + "";
                    index += i;
                    break;
                }
            }
        }

        String num1 = convertedText.substring(0, index);
        String num2 = convertedText.substring(index + 1);
        double dFirstNumber, dSecondNumber;


        if (checkIfContainsDotOrComma(num1)) {
            dFirstNumber = Double.parseDouble(num1);
        } else {
            dFirstNumber = Integer.parseInt(num1);
        }

        if (checkIfContainsDotOrComma(num2)) {
            dSecondNumber = Double.parseDouble(num2);
        } else {
            dSecondNumber = Integer.parseInt(num2);
        }

        return Function(operator, dFirstNumber, dSecondNumber);
    }

    public static boolean checkIfContainsDotOrComma(String text) {
        if (text.contains(".") || text.contains(","))
            return true;

        return false;
    }

    public static double Function(String operator, double a, double b) {
        double sum = 0;

        switch (operator) {
            case "+":
                sum += Add(a, b);
                break;
            case "-":
                sum += Subtract(a, b);
                break;
            case "*":
                sum += Multiply(a, b);
                break;
            case "/":
                sum += Divide(a, b);
                break;
            default:
                sum += 0;
        }
        return sum;
    }


    public static void main(String[] args) {

        RunCalc();
    }

}
