package EinfachesSpiel.view;

import javax.swing.*;
import java.awt.*;

public class ViewPanel extends JPanel {

    private final JLabel rundenergebnisHeader = new JLabel("Rundenergebnis:");
    private final JLabel gesamtpunkteHeader = new JLabel("Gesamtpunkte:");

    private final JLabel rundenergebnisWert = new JLabel("Tippe eine Zahl von 1 bis 9");
    private final JLabel gesamtpunkteWert = new JLabel("30");

    private final JLabel deineZahlLabel = new JLabel("Deine Zahl:");
    private final JLabel computerLabel = new JLabel("Computer:");

    private final JTextField deineZahl = new JTextField();
    private final JTextField computerZahl = new JTextField();

    private final JButton nochEinmalBtn = new JButton("Noch einmal!");

    public ViewPanel() {
        JPanel headerPanel = new JPanel(new GridLayout(2, 2));
        headerPanel.add(rundenergebnisHeader);
        headerPanel.add(gesamtpunkteHeader);
        headerPanel.add(rundenergebnisWert);
        headerPanel.add(gesamtpunkteWert);

        JPanel deineZahlPanel = new JPanel(new BorderLayout());
        deineZahlPanel.add(deineZahlLabel, BorderLayout.NORTH);
        deineZahlPanel.add(deineZahl, BorderLayout.CENTER);

        JPanel computerPanel = new JPanel(new BorderLayout());
        computerPanel.add(computerLabel, BorderLayout.NORTH);
        computerPanel.add(computerZahl, BorderLayout.CENTER);

        JPanel centerPanel = new JPanel(new GridLayout(1, 2));
        centerPanel.add(deineZahlPanel);
        centerPanel.add(computerPanel);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(nochEinmalBtn);

        computerZahl.setEditable(false);

        rundenergebnisWert.setOpaque(true);
        rundenergebnisWert.setBackground(Color.WHITE);
        rundenergebnisWert.setFont(rundenergebnisWert.getFont().deriveFont(Font.BOLD, 16f));

        gesamtpunkteWert.setOpaque(true);
        gesamtpunkteWert.setBackground(Color.WHITE);
        gesamtpunkteWert.setFont(gesamtpunkteWert.getFont().deriveFont(Font.BOLD, 16f));

        this.setLayout(new BorderLayout());
        this.add(headerPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
    }

    public JLabel getRundenergebnisWert() { return rundenergebnisWert; }
    public JLabel getGesamtpunkteWert() { return gesamtpunkteWert; }
    public JTextField getDeineZahl() { return deineZahl; }
    public JTextField getComputerZahl() { return computerZahl; }
    public JButton getNochEinmalBtn() { return nochEinmalBtn; }
}