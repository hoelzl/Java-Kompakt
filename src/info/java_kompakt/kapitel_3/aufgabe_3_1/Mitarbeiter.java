/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_3.aufgabe_3_1;

/**
 * Die Klasse <code>Mitarbeiter</code> repräsentiert Mitarbeiter eines
 * Unternehmens.
 *
 * @author Matthias Hölzl (tc@xantira.com)
 */
public class Mitarbeiter {

    ////////////////////////////////////////////////////////////////////
    // Instanzvariablen
    ////////////////////////////////////////////////////////////////////

    /**
     * Der Name des Mitarbeiters.
     */
    String name;

    /**
     * Die Mitarbeiternummer. Sie wird als String gespeichert, um z.B. führende
     * Nullen zu erhalten.
     */
    String mitarbeiterNr;

    /**
     * Das aktuelle Gehalt des Mitarbeiters.
     */
    double gehalt;
    Firma firma;

    ////////////////////////////////////////////////////////////////////
    // Konstruktor
    ////////////////////////////////////////////////////////////////////

    /**
     * Ein Konstrukter, der neue <code>Mitarbeiter</code>-Instanzen erzeugt.
     *
     * @param name Der Name des Mitarbeiters
     * @param mitarbeiterNr Die Mitarbeiternummer als String
     * @param firma Die Firma, in der der Mitarbeiter arbeitet
     */
    public Mitarbeiter(String name, String mitarbeiterNr, Firma firma) {
        this.name = name;
        this.mitarbeiterNr = mitarbeiterNr;
        this.firma = firma;
        gehalt = 25000.0;
    }

    ////////////////////////////////////////////////////////////////////
    // Setter
    ////////////////////////////////////////////////////////////////////

    /**
     * Setter für das Attribut <code>name</code>.
     *
     * @param name Der neue Name des Mitarbeiters
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter für das Attribut <code>mitarbeiterNr</code>.
     *
     * @param mitarbeiterNr Die neue Mitarbeiternummer des Mitarbeiters
     */
    public void setMitarbeiterNr(String mitarbeiterNr) {
        this.mitarbeiterNr = mitarbeiterNr;
    }

    /**
     * Setter für das Attribut <code>gehalt</code>.
     *
     * @param gehalt Das neue Gehalt des Mitarbeiters
     */
    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    /**
     * Setter für das Attribut <code>firma</code>.
     *
     * @param firma Die neue Firma, für die der Mitarbeiter arbeitet
     */
    public void setFirma(Firma firma) {
        this.firma = firma;
    }

    ////////////////////////////////////////////////////////////////////
    // Methoden
    ////////////////////////////////////////////////////////////////////

    /**
     * Gibt Informationen über den Mitarbeiter auf der Konsole aus.
     */
    public void druckeInfo() {
        System.out.format("Mitarbeiter: %s (%s), verdient %7.2f€\n",
                name, mitarbeiterNr, gehalt);
    }

    // Signatur der Methode zum Beantragen einer Gehaltserhöhung:
    //
    // public void beantrageGehaltserhoehung(double prozent)

    // Signatur der Methode zum Erhöhen des Gehalts.  Die Methode wird als
    // private deklariert, damit es nicht möglich ist, damit das Gehalt eines
    // Mitarbeiters zu erhöheh, der dazu nicht berechtigt ist.
    //
    // private void erhoeheGehalt(double prozent)
}
