/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_3.aufgabe_3_4;

/**
 * Vereinfachte Version der Klasse <code>Mitarbeiter</code> aus Aufgaben 3.1
 * und 3.2 um das Überladen von Konstruktoren zu demonstrieren.
 *
 * @author Matthias Hölzl (tc@xantira.com)
 */
public class Mitarbeiter {
    private String name;
    private String mitarbeiterNr;
    private double gehalt;

    public void printMitarbeiter() {
        System.out.format("Mitarbeiter: %s (%s), verdient %.2f€\n",
                name, mitarbeiterNr, gehalt);
    }

    // Konstruktor I: alle Instanzvariablen werden initialisiert.
    public Mitarbeiter(String name, String mitarbeiterNr, double gehalt) {
        this.name = name;
        this.mitarbeiterNr = mitarbeiterNr;
        this.gehalt = gehalt;
    }

    // Konstruktor II: Gehalt wird auf Default-Wert gesetzt.
    public Mitarbeiter(String name, String mitarbeiterNr) {
        // Aufruf von Konstrukotr I mit Default-Wert für das Gehalt.
        this(name, mitarbeiterNr, 25000.0);
    }

    // Konstruktor III: Name und Gehalt werden mit den Parameter-Werten
    // initialisiert, Mitarbeiternummer erhält den Wert `null'..
    public Mitarbeiter(String name, double gehalt) {
        // Aufruf von Konstruktor I mit Default-Wert für die Mitarbeiternummer.
        this(name, null, gehalt);
    }

    // Konstruktor IV: Nur der Name wird als Parameter übergeben.
    public Mitarbeiter(String name) {
        // Aufruf von Konstruktor III mit Default-Wert für das Gehalt.
        // Der aufgerufene Konstruktor fügt den Default-Wert für die
        // Mitarbeiternummer hinzu.
        this(name, 0.0);
    }

    public static void main(String[] args) {
        Mitarbeiter m1 = new Mitarbeiter("Klaus Gärtner", "362", 30000.0);
        Mitarbeiter m2 = new Mitarbeiter("Reinhold Bauer", "002");
        Mitarbeiter m3 = new Mitarbeiter("Heike Gruber", 50000.0);
        Mitarbeiter m4 = new Mitarbeiter("Silke Anhold");

        m1.printMitarbeiter();
        m2.printMitarbeiter();
        m3.printMitarbeiter();
        m4.printMitarbeiter();
    }
}
