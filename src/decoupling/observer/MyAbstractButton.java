package decoupling.observer;

import javax.swing.*;

public abstract class MyAbstractButton extends JPanel {
    abstract void addListener(IMyActionObserver observer);
    abstract void removeListener();

    abstract void checkForHover();
}
