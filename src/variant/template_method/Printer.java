package variant.template_method;

public abstract class Printer {
    public void print(String output) {
        System.out.println(getEditedOutput(output));
    }

    protected abstract String getEditedOutput(String output);
}
