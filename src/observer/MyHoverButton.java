package observer;

import javax.swing.*;
import java.awt.*;

public class MyHoverButton extends MyAbstractButton {
    IMyActionObserver observer;

    @Override
    public void addListener(IMyActionObserver observer) {
        this.observer = observer;
        checkForHover();
    }

    @Override
    public void removeListener() {
        this.observer = null;
    }

    @Override
    public void checkForHover() {
        final MyHoverButton button = this;
        final Thread check = new Thread(() -> {
            if (observer == null) {
                return;
            }
            double minX;
            double minY;

            try {
                minX = button.getLocationOnScreen().getX();
                minY = button.getLocationOnScreen().getY();
            } catch (IllegalComponentStateException ignored) {
                checkForHover();
                return;
            }
            double maxX = minX + getBounds().getWidth();
            double maxY = minY + getBounds().getHeight();
            double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
            double mouseY = MouseInfo.getPointerInfo().getLocation().getY();

            if (minX <= mouseX && mouseX <= maxX && minY <= mouseY && mouseY <= maxY) {
                observer.onHover();
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            checkForHover();
        });
        check.start();
    }
}
