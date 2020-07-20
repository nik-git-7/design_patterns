package observer;

import javax.swing.*;
import java.awt.*;

public abstract class MyAbstractButton extends JPanel {
    abstract void addListener(IMyActionObserver observer);
    abstract void removeListener();

    abstract void checkForHover();
}
