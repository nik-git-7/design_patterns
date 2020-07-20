package variant.template_method;

public class Main {
    public static void main(String[] args) {
        Printer upper = new UpperPrinter();
        upper.print("Hello World");

        Printer lower = new LowerPrinter();
        lower.print("Hello World");
    }
}
