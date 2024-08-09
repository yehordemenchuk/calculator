package operations;

public class Multiplication extends Operation {
    public Multiplication() {
        super(0, 0);
    }

    public Multiplication(double first_operand, double second_operand) {
        super(first_operand, second_operand);
    }

    public double perform() {
        return this.get_first_operand() * this.get_second_operand();
    }
}
