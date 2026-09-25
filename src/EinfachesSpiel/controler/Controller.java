package EinfachesSpiel.controler;

import EinfachesSpiel.Model.GewinnModel;
import EinfachesSpiel.view.ViewPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private final GewinnModel model;
    private final ViewPanel view;

    public Controller(GewinnModel model, ViewPanel view) {
        this.model = model;
        this.view = view;

        view.getDeineZahl().setActionCommand("Spielen");
        view.getDeineZahl().addActionListener(this);

        view.getNochEinmalBtn().setActionCommand("Noch einmal!");
        view.getNochEinmalBtn().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}