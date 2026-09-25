package EinfachesSpiel.controler;

import EinfachesSpiel.Model.GewinnModel;
import EinfachesSpiel.view.ViewFrame;
import EinfachesSpiel.view.ViewPanel;

import java.awt.*;
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
        switch (e.getActionCommand()) {
            case "Spielen":
                spieleRunde();
                break;
            case "Noch einmal!":
                neueRunde();
                break;
        }
    }

    private void spieleRunde() {
        String eingabe = view.getDeineZahl().getText();

        if (eingabe == null || eingabe.trim().isEmpty()) {
            return;
        }

        int spielerZahl;
        try {
            spielerZahl = Integer.parseInt(eingabe.trim());
        } catch (NumberFormatException ex) {
            return;
        }

        if (spielerZahl < 1 || spielerZahl > 9) {
            return;
        }

        model.berechneComputerZahl();
        model.berechneRunde(spielerZahl);

        view.getComputerZahl().setText(String.valueOf(model.getComputerZahl()));
        view.getRundenergebnisWert().setText(formatErgebnis(model.getRundenErgebnis()));
        view.getGesamtpunkteWert().setText(String.valueOf(model.getGesamtPunkte()));

        view.getDeineZahl().setEditable(false);
        view.getNochEinmalBtn().setEnabled(true);

        // aus version-2.0
        Color rueckmeldung = ermittleFarbe();
        view.getRundenergebnisWert().setBackground(rueckmeldung);
        view.getGesamtpunkteWert().setBackground(rueckmeldung);
    }

    private void neueRunde() {
        view.getDeineZahl().setText("");
        view.getComputerZahl().setText("");
        view.getRundenergebnisWert().setText("Tippe eine Zahl von 1 bis 9");

        view.getDeineZahl().setEditable(true);
        view.getNochEinmalBtn().setEnabled(false);

        view.getRundenergebnisWert().setBackground(Color.WHITE);
        view.getGesamtpunkteWert().setBackground(Color.WHITE);

        view.getDeineZahl().requestFocus();
    }

    private Color ermittleFarbe() {
        if (model.hatGewonnen() || model.getRundenErgebnis() > 0) {
            return Color.GREEN;
        }
        if (model.hatVerloren() || model.getRundenErgebnis() < 0) {
            return Color.RED;
        }
        return Color.WHITE;
    }

    private String formatErgebnis(int rundenErgebnis) {
        if (rundenErgebnis > 0) {
            return "+" + rundenErgebnis;
        }
        return String.valueOf(rundenErgebnis);
    }


    public static void main(String[] args) {
        GewinnModel model = new GewinnModel();
        ViewPanel viewPanel = new ViewPanel();
        Controller controller = new Controller(model, viewPanel);
        new ViewFrame(viewPanel);
    }
}