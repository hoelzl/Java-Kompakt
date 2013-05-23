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

    public void reicheEin() {
        System.out.println("Beantrage Personalausweis:");
        System.out.format("  Nummer:       %s\n", ausweisNr);
        System.out.format("  Vorname:      %s\n", vorname);
        System.out.format("  Nachname:     %s\n", nachname);
        System.out.format("  Geburtsdatum: %s\n", geburtsdatum);
        System.out.format("  Wohnort:      %s\n", wohnort);
    }

    public static void main(String[] args) {
        PersonalausweisAntrag p = new PersonalausweisAntrag()
                .setAusweisNr("1234567890")
                .setVorname("Hans")
                .setNachname("Mayer")
                .setGeburtsdatum("1984-02-27")
                .setWohnort("München");
        p.reicheEin();
    }
}
