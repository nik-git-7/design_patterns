package decoupling.bridge;

public class Main {
    public static void main(String[] args) {
        Communicator greeter = new Greeter(new LowerPrinter());
        Communicator greeter2 = new Greeter(new UpperPrinter());
        Communicator leaver = new Leaver(new LowerPrinter());
        Communicator leaver2 = new Leaver(new UpperPrinter());

        greeter.communicate();
        greeter2.communicate();
        leaver.communicate();
        leaver2.communicate();
    }
}
