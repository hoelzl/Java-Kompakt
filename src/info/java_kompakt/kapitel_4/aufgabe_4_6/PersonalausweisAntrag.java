/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_4.aufgabe_4_6;

/**
 * Eine Klasse, die die Daten zum Erstellen eines Personalausweises bündelt.
 * <p>Wir definieren diese Klasse mit einem sog. "Fluid Interface" für die
 * Konstruktion von Instanzen.  Statt einen Konstruktor mit mehreren Argumenten
 * zu implementieren, verwenden wir den Default-Konstruktor, und definieren
 * die Setter so, dass sie nicht <code>void</code> sondern <code>this</code>,
 * also eine Instanz vom Typ <code>PersonalausweisAntrag</code> zurückgeben.
 * Dadurch können Setter für diejenigen Attribute, die wir setzen wollen,
 * einfach nacheinander aufgerufen werden: um Attribute <code>a</code> und
 * <code>b</code> eines Objekts <code>o</code> zu setzen, kann man die
 * Setter so aufrufen:
 * <code>o.setA(newA).setB(newB)</code>.  Der Aufruf von <code>setA</code>
 * gibt ja <code>this</code>, also wieder das Objekt <code>o</code> zurück,
 * deshalb ändert der Aufruf von <code>setB</code> das Attribut <code>b</code>
 * von <code>o</code> usw.</p>
 *
 * @author Matthias Hölzl (tc@xantira.com)
 */
public class PersonalausweisAntrag {
    /**
     * Die Nummer des Ausweises.
     */
    private String ausweisNr;

    /**
     * Der Vorname des Ausweisinhabers
     */
    private String vorname;

    /**
     * Der Nachname des Ausweisinhabers
     */
    private String nachname;

    /**
     * Das Geburtsdatum des Ausweisinhabers
     */
    private String geburtsdatum;

    /**
     * Der Wohnort des Ausweisinhabers
     */
    private String wohnort;

    // ...


    public String getAusweisNr() {
        return ausweisNr;
    }

    public PersonalausweisAntrag setAusweisNr(String ausweisNr) {
        this.ausweisNr = ausweisNr;
        return this;
    }

    public String getVorname() {
        return vorname;
    }

    public PersonalausweisAntrag setVorname(String vorname) {
        this.vorname = vorname;
        return this;
    }

    public String getNachname() {
        return nachname;
    }

    public PersonalausweisAntrag setNachname(String nachname) {
        this.nachname = nachname;
        return this;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public PersonalausweisAntrag setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
        return this;
    }

    public String getWohnort() {
        return wohnort;
    }

    public PersonalausweisAntrag setWohnort(String wohnort) {
        this.wohnort = wohnort;
        return this;
    }

    /**
     * Reiche den Antrag beim Einwohnermeldeamt ein und beginne die Bearbeitung.
     * Wir geben in diesem Beispiel nur die Daten des Antrags aus.
     */
    public void reicheEin() {
        System.out.println("Beantrage Personalausweis:");
        System.out.format("  Nummer:       %s\n", ausweisNr);
        System.out.format("  Vorname:      %s\n", vorname);
        System.out.format("  Nachname:     %s\n", nachname);
        System.out.format("  Geburtsdatum: %s\n", geburtsdatum);
        System.out.format("  Wohnort:      %s\n", wohnort);
    }

    /**
     * <code>main</code>-Methode für Aufgabe 4.6(1).
     *
     * @param args Kommandozeilenargumente
     */
    public static void main(String[] args) {
        // Hier nutzen wir die "fluid"-Definition der Setter aus, indem wir
        // die Setter für alle Attribute auf das gleiche Objekt anwenden.
        PersonalausweisAntrag p = new PersonalausweisAntrag()
                .setAusweisNr("1234567890")
                .setVorname("Hans")
                .setNachname("Mayer")
                .setGeburtsdatum("1984-02-27")
                .setWohnort("München");
        p.reicheEin();
    }
}
