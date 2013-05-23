/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_4.aufgabe_4_6;

/**
 * Implementierung eines Mitarbeiters im Buchhaltungssystem einer Firma.
 *
 * @author Matthias Hölzl (tc@xantira.com)
 */
public class Mitarbeiter {
    /**
     * Der Name des Mitarbeiters
     */
    private String name;

    /**
     * Die Mitarbeiternummer
     */
    private String mitarbeiterNr;

    /**
     * Das Grundgehalt des Mitarbeiters
     */
    private double grundgehalt;

    /**
     * Der Zuschlag auf das Grundgehalt, der dem Mitarbeiter zusteht
     */
    private double zuschlag;

    /**
     * Die Steuerklasse, in die der Mitarbeiter fällt
     */
    private int steuklasse;


    public Mitarbeiter(String name, String mitarbeiterNr, double grundgehalt,
                       double zuschlag, int steuklasse) {
        this.name = name;
        this.mitarbeiterNr = mitarbeiterNr;
        this.grundgehalt = grundgehalt;
        this.zuschlag = zuschlag;
        this.steuklasse = steuklasse;
    }


    // Methoden

    /**
     * Berechnet das aktuelle Gehalt des Mitarbeiters
     *
     * @return Gehalt (incl. Zuschläge)
     */
    public double berechneGehalt() {
        return grundgehalt + zuschlag;
    }
    // ...

    // Getter und Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMitarbeiterNr() {
        return mitarbeiterNr;
    }

    public void setMitarbeiterNr(String mitarbeiterNr) {
        this.mitarbeiterNr = mitarbeiterNr;
    }

    public double getGrundgehalt() {
        return grundgehalt;
    }

    public void setGrundgehalt(double grundgehalt) {
        this.grundgehalt = grundgehalt;
    }

    public double getZuschlag() {
        return zuschlag;
    }

    public void setZuschlag(double zuschlag) {
        this.zuschlag = zuschlag;
    }

    public int getSteuklasse() {
        return steuklasse;
    }

    public void setSteuklasse(int steuklasse) {
        this.steuklasse = steuklasse;
    }


}
