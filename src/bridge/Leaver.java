package bridge;

public class Leaver extends Communicator {
    public Leaver(Printer printer) {
        super(printer);
    }

    @Override
    protected String getMsg() {
        return "Bye Bye";
    }
}
