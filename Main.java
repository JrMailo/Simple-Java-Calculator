import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        char operator;

        System.out.print("Enter the first number: ");
        a = scanner.nextDouble();

        System.out.print("Enter the operator(+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        b = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0)
                    result = a / b;
                else {
                    System.out.println("Error: division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Unknown operator.");
                return;
        }

        System.out.println("Result: " + result);
    }
}