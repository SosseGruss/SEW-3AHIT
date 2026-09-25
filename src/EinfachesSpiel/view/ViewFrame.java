package EinfachesSpiel.view;

import javax.swing.*;

public class ViewFrame extends JFrame {

    public ViewFrame(ViewPanel panel) {
        this.setTitle("Zahlen-Gewinnspiel (v1.0)");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }
}