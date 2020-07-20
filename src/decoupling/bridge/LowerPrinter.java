package decoupling.bridge;

public class LowerPrinter implements Printer {
    @Override
    public void show(String output) {
        System.out.println(output.toLowerCase());
    }
}
