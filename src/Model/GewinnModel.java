package Model;

import java.util.Random;

public class GewinnModel {
    private int gesamtPunkte;
    private int spielerZahl;
    private int computerZahl;
    private int rundenErgebnis;

    public GewinnModel() {
        this.gesamtPunkte = 30;
        this.spielerZahl = 0;
        this.computerZahl = 0;
        this.rundenErgebnis = 0;
    }

    public int getGesamtPunkte(){
        return this.gesamtPunkte;
    }

    public int getComputerZahl(){
        return this.computerZahl;
    }

    public int getRundenErgebnis(){
        return this.rundenErgebnis;
    }

    public void berechneComputerZahl(){
        Random rng = new Random();
        this.computerZahl = rng.nextInt(9) + 1;
    }

    public void berechneRunde(int spielerZahl){
        this.spielerZahl = spielerZahl;

        if(this.computerZahl == spielerZahl){
            this.gesamtPunkte += 20;
        } else if (computerZahl+1 == spielerZahl || computerZahl-1 == spielerZahl) {
            this.gesamtPunkte += 5;
        }
        else {
            this.gesamtPunkte -= 10;
        }
    }
}
