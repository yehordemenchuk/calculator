package operations;

public class Addition extends Operation {
    public Addition() {
        super(0, 0);
    }

    public Addition(double first_operand, double second_operand) {
        super(first_operand, second_operand);
    }

    public double perform() {
        return this.get_first_operand() + this.get_second_operand();
    }
}
