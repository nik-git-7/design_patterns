package decoupling.bridge;

public abstract class Communicator {
    private final Printer printer;
    private String msg;

    public Communicator(Printer printer) {
        this.printer = printer;
    }
    abstract protected String getMsg();

    protected void communicate() {
        printer.show(getMsg());
    }
}
