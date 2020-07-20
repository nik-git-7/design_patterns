package variant.template_method;

public class UpperPrinter extends Printer {
    @Override
    protected String getEditedOutput(String output) {
        return output.toUpperCase();
    }
}
