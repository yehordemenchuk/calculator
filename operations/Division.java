package operations;

public class Division extends Operation {
    public Division() {
        super(0, 0);
    }

    public Division(double first_operand, double second_operand) {
        super(first_operand, second_operand);
    }

    public double perform() {
        return this.get_first_operand() / this.get_second_operand();
    }
}
