import operations.*;

public class Calculator {
    public static void main(String[] args) {
        Addition addition = new Addition(12, 4);

        System.out.println(addition.perform());
    }
}
