package bridge;

public class Greeter extends Communicator  {
    public Greeter(Printer printer) {
        super(printer);
    }

    @Override
    protected String getMsg() {
        return "Hello World";
    }
}
