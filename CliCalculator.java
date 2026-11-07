
import java.util.Scanner;

public class CliCalculator {
    static void calculate(double x, double y, String op) {
        switch (op) {
            case "+":
                System.out.println("The result is: " + (x + y));
                break;
            case "-":
                System.out.println("The result is: " + (x - y));
                break;
            case "*":
                System.out.println("The result is: " + (x * y));
                break;
            case "/":
                if (y == 0) {
                    System.out.println("Cannot divide by zero!!");
                    break;
                } else {
                    double result = x / y;
                    System.out.println("The result is: " + result);
                    break;
                }
        }
    }

    static double readNumber(Scanner cs, String prompt) {

        while (true) {
            String num;
            System.out.print(prompt);
            num = cs.nextLine().trim();
            try {
                double dnum = Double.parseDouble(num);
                return dnum;
            } catch (NumberFormatException e) {
                System.out.println("You Entered a wrong type, pleas Enter a double Number!");
            }
        }
    }

    static String readOperation(Scanner objScanner) {

        
        while (true) {
            System.out.print("\n Enter the operation (+, -, *, /) or 'q' to quit: ");
            String operation = objScanner.nextLine().trim();
            if (operation.equals("+") || operation.equals("/") || operation.equals("-")
                    || operation.equals("*"))
                return operation;
            else if (operation.equals("q") || operation.equals("Q"))
                System.exit(0);
            else
                System.out.print("Invalid operation, try again.");
            continue;
        }
    }

    public static void main(String[] args) {
        double A = 0;
        double B = 0;
        Scanner objScanner = new Scanner(System.in);
        while (true) {
            String operation = readOperation(objScanner);
            A = readNumber(objScanner, "Enter the first number: ");
            B = readNumber(objScanner, "Enter the second number: ");
            calculate(A, B, operation);
        }
    }
}
