/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_4.aufgabe_4_1;

/**
 * Die Klasse <code>Mitarbeiter</code> in dieser Aufgabe ist eine erweiterte
 * Version der Klasse <code>Mitarbeiter</code> aus Aufgabe 3.2.  Sie
 * repräsentiert wieder Mitarbeiter eines Unternehmens; zusätzlich zählt
 * die Klasse, wie viele Instanzen erzeugt wurden.
 *
 * @author Matthias Hölzl (tc@xantira.com)
 */
public class Mitarbeiter {

    ////////////////////////////////////////////////////////////////////
    // Statische Variablen
    ////////////////////////////////////////////////////////////////////

    static int gesamtzahl = 0;

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
        // Der Zähler für alle erzeugten Mitarbeiter wird erhöht.
        gesamtzahl++;

        // Der Rest der Initialisierung erfolgt wie in Aufgabe 3.2.
        this.name = name;
        this.firma = firma;
        if (firma != null) {
            double standardGehalt = 25000.0;
            // Dieser Methodenaufruf setzt this.mitarbeiterNr und
            // this.gehalt
            firma.stelleMitarbeiterEin(this, mitarbeiterNr, standardGehalt);
        }
        else {
            this.mitarbeiterNr = "";
            gehalt = 0.0;
        }
    }

    /**
     * Ein überladener Konstruktor, der eine neue <code>Mitarbeiter</code>-Instanz
     * erzeugt, die für keine Firma arbeitet.
     *
     * @param name Der Name des Mitarbeiters
     */
    public Mitarbeiter(String name) {
        this(name, "", null);
    }

    ////////////////////////////////////////////////////////////////////
    // Getter und Setter
    ////////////////////////////////////////////////////////////////////

    /**
     * Getter für das Attribut <code>name</code>.
     *
     * @return Der Name des Mitarbeiters
     */
    public String getName() {
        return name;
    }

    /**
     * Setter für das Attribut <code>name</code>.
     *
     * @param name Der neue Name des Mitarbeiters
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter für das Attribut <code>mitarbeiterNr</code>.
     *
     * @return Die Mitarbeiternummer des Mitarbeiters
     */
    public String getMitarbeiterNr() {
        return mitarbeiterNr;
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
     * Getter für das Attribut <code>gehalt</code>.
     *
     * @return Das Gehalt des Mitarbeiters
     */
    public double getGehalt() {
        return gehalt;
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
     * Getter für das Attribut <code>firma</code>.
     *
     * @return Die Firma, in der der Mitarbeiter arbeitet
     */
    public Firma getFirma() {
        return firma;
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
    // Statische Methoden
    ////////////////////////////////////////////////////////////////////

    /**
     * Getter für die Gesamtzahl der erzeugten
     * <code>Mitarbeiter</code>-Instanzen.
     *
     * @return Die insgesamt erzeugte Anzahl der Mitarbeiter.
     */
    public static int getGesamtzahl() {
        return gesamtzahl;
    }


    ////////////////////////////////////////////////////////////////////
    // Methoden
    ////////////////////////////////////////////////////////////////////

    /**
     * Gibt Informationen über den Mitarbeiter auf der Konsole aus.
     */
    public void druckeInfo() {
        System.out.format("Mitarbeiter: %s (%s), verdient %.2f€, ",
                name, mitarbeiterNr, gehalt);
        if (firma == null) {
            System.out.println("momentan arbeitslos");
        }
        else {
            System.out.format("arbeitet bei %s\n", firma.getName());
        }
    }

    /**
     * Gibt <code>true</code> zurück, wenn der Mitarbeiter berechtigt ist, eine
     * Gehaltserhöhung zu bekommen, <code>false</code> falls der Mitarbeiter
     * nicht dazu berechtigt ist.
     *
     * @return <code>true</code> falls zur Gehaltserhöhung berechtigt,
     * <code>false</code> sonst.
     */
    public boolean bekommtGehaltserhoehung() {
        // Der aktuelle Algorithmus stößt bei der Geschäftsführung noch auf
        // Widerstand ist dafür aber bei Mitarbeitern sehr populär.
        //
        return true;
    }

    /**
     * Erhöht das Gehalt des Mitarbeiters um <code>prozent</code>%.  Zum
     * Beispiel bewirkt ein Aufruf <code>erhoeheGehalt(5.0)</code>, dass das
     * aktuelle Gehalt des Mitarbeiters um 5% erhöht wird.
     *
     * @param prozent Die Gehaltserhöhung in Prozent
     */
    private void erhoeheGehalt(double prozent) {
        gehalt *= 1.0 + prozent / 100.0;
    }

    /**
     * Erhöht das Gehalt des Mitarbeiters um <code>prozent</code>%, falls der
     * Mitarbeiter im Moment zu einer Gehaltserhöhung berechtigt ist.  Zum
     * Beispiel bewirkt ein Aufruf <code>beantrageGehaltserhoehung(5.0)</code>,
     * dass das aktuelle Gehalt des Mitarbeiters um 5% erhöht wird, sofern der
     * Mitarbeiter zur Erhöhung berechtigt ist.  Falls der Mitarbeiter nicht zu
     * einer Erhöhung berechtigt ist, hat der Aufruf keinen Effekt.
     *
     * @param prozent Die Gehaltserhöhung in Prozent
     */
    public void beantrageGehaltserhoehung(double prozent) {
        if (bekommtGehaltserhoehung()) {
            erhoeheGehalt(prozent);
        }
    }
}
