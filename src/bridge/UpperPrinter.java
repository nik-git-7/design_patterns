package bridge;

public class UpperPrinter implements Printer {
    @Override
    public void show(String output) {
        System.out.println(output.toUpperCase());
    }
}
