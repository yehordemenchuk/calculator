package operations;

public class Subtraction extends Operation {
    public Subtraction() {
        super(0, 0);
    }

    public Subtraction(double first_operand, double second_operand) {
        super(first_operand, second_operand);
    }

    public double perform() {
        return this.get_first_operand() - this.get_second_operand();
    }
}