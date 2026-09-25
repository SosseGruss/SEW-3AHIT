package EinfachesSpiel.view;

import javax.swing.*;
import java.awt.*;

public class ViewFrame extends JFrame {

    public ViewFrame(ViewPanel panel) {
        this.setTitle("Zahlen-Gewinnspiel (v1.0)");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.setMinimumSize(new Dimension(450, 350));
        this.pack();
        this.setVisible(true);
    }
}