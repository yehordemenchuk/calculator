package operations;

public abstract class Operation {
    private double first_operand;
    private double second_operand;

    public Operation(double first_operand, double second_operand) {
        this.first_operand = first_operand;

        this.second_operand = second_operand;
    }

    public double get_first_operand() { return first_operand; }

    public double get_second_operand() { return second_operand; }

    public abstract double perform();
}
