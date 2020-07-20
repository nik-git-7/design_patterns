package observer;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Observer");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 400, 300);

        JPanel root = new JPanel(new BorderLayout());

        MyAbstractButton button = new MyHoverButton();
        button.setBackground(Color.BLUE);
        button.addListener(() -> System.out.println("Hover"));

        root.add(button, BorderLayout.NORTH);
        frame.setContentPane(root);
        frame.setVisible(true);
    }
}
