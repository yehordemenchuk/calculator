import java.util.InputMismatchException;
import java.util.Scanner;
import operations.*;

public class Calculator {
    public static void main(String[] args) {
        run();
    }

    private static void get_result(char operator, double first_operand, double second_operand)
            throws ArithmeticException {
        double result = switch (operator) {
            case '+' -> {
                Addition addition = new Addition(first_operand, second_operand);

                yield addition.perform();
            }

            case '-' -> {
                Subtraction subtraction = new Subtraction(first_operand, second_operand);

                yield subtraction.perform();
            }

            case '*' -> {
                Multiplication multiplication = new Multiplication(first_operand, second_operand);

                yield multiplication.perform();
            }

            case '/' -> {
                Division division = new Division(first_operand, second_operand);

                yield division.perform();
            }

            default -> Double.NaN;
        };

        if (Double.isNaN(result) || Double.isInfinite(result)) {
            throw new ArithmeticException("Impossible operation.");
        }

        System.out.println("Result: " + result);
    }

    private static void calculate() throws InputMismatchException, ArithmeticException {
        double first_operand, second_operand;
        char operator;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        first_operand = in.nextDouble();

        System.out.print("Enter operation: ");
        operator = in.next().charAt(0);

        System.out.print("Enter another number: ");
        second_operand = in.nextDouble();

        get_result(operator, first_operand, second_operand);
    }

    private static void run() {
        try {
            calculate();
        }

        catch (InputMismatchException ex) {
            System.out.println("Print decimals with coma. Not with dot.");
        }

        catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}