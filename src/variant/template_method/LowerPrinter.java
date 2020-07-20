package variant.template_method;

public class LowerPrinter extends Printer {
    @Override
    protected String getEditedOutput(String output) {
        return output.toLowerCase();
    }
}
