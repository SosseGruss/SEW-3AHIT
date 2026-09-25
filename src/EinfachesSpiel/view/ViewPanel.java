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
        JPanel headerPanel = new JPanel(new GridLayout(2, 2, 10, 5));
        headerPanel.add(rundenergebnisHeader);
        headerPanel.add(gesamtpunkteHeader);
        headerPanel.add(rundenergebnisWert);
        headerPanel.add(gesamtpunkteWert);

        JPanel deineZahlPanel = new JPanel(new BorderLayout());
        deineZahlPanel.add(deineZahlLabel, BorderLayout.NORTH);
        deineZahlPanel.add(deineZahl, BorderLayout.CENTER);
        deineZahlLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel computerPanel = new JPanel(new BorderLayout());
        computerPanel.add(computerLabel, BorderLayout.NORTH);
        computerPanel.add(computerZahl, BorderLayout.CENTER);
        computerLabel.setHorizontalAlignment(SwingConstants.CENTER);

        Font eingabeFont = new Font("SansSerif", Font.BOLD, 24);

        deineZahl.setFont(eingabeFont);
        deineZahl.setHorizontalAlignment(JTextField.CENTER);

        computerZahl.setFont(eingabeFont);
        computerZahl.setHorizontalAlignment(JTextField.CENTER);

        JPanel centerPanel = new JPanel(new GridLayout(1, 2));
        centerPanel.add(deineZahlPanel);
        centerPanel.add(computerPanel);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(nochEinmalBtn);

        computerZahl.setEditable(false);

        rundenergebnisWert.setOpaque(true);
        rundenergebnisWert.setBackground(Color.WHITE);
        rundenergebnisWert.setFont(rundenergebnisWert.getFont().deriveFont(Font.BOLD, 16f));
        rundenergebnisWert.setHorizontalAlignment(SwingConstants.CENTER);
        rundenergebnisWert.setBorder(BorderFactory.createEmptyBorder(4, 8, 4, 8));
        rundenergebnisHeader.setHorizontalAlignment(SwingConstants.CENTER);

        gesamtpunkteWert.setOpaque(true);
        gesamtpunkteWert.setBackground(Color.WHITE);
        gesamtpunkteWert.setFont(gesamtpunkteWert.getFont().deriveFont(Font.BOLD, 16f));
        gesamtpunkteWert.setHorizontalAlignment(SwingConstants.CENTER);
        gesamtpunkteWert.setBorder(BorderFactory.createEmptyBorder(4, 8, 4, 8));
        gesamtpunkteHeader.setHorizontalAlignment(SwingConstants.CENTER);

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