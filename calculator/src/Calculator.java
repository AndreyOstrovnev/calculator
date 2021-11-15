import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double firstArgument = calculator.readFirstArgument();
        double secondArgument = calculator.readSecondArgument();
        String operation = calculator.readOperation();
        double result = calculator.performOperation(firstArgument, secondArgument, operation);
        calculator.writeResult(firstArgument, secondArgument, result, operation);
    }

    private String readOperation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write operation +, -, / or *");
        return sc.next();
    }

    private Double readFirstArgument() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write first argument");
        return Double.parseDouble(sc.next());
    }

    private Double readSecondArgument() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write second argument");
        return Double.parseDouble(sc.next());
    }

    private void writeResult(double firstArgument, double secondArgument, double result, String operation) {
        System.out.printf("%f %s %f = %f", firstArgument, operation, secondArgument, result);
    }

    private double performOperation(double firstArgument, double secondArgument, String operation) {
        return 0;
    }
}
