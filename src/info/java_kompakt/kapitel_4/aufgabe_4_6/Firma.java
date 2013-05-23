/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_4.aufgabe_4_6;

/**
 * Daten einer Firma beim Handlsregister.
 * Die Daten sind nach dem
 * <a href="https://www.handelsregister.de/rp_web/mask.do?Typ=e">Suchformular
 * des Handelsregisters</a> modeliert.
 *
 * @author Matthias Hölzl (tc@xantira.com)
 */
public class Firma {
    /**
     * Der Name der Firma
     */
    private String name;

    /**
     * Die Registernummer der Firma
     */
    private String registernummer;

    /**
     * Das Registergericht, bei dem die Firma eingetragen ist
     * (Freiburg, Mannheim, Stuttgart oder Ulm).
     */
    private String registergericht;

    /**
     * Die Postleitzahl der Firma
     */
    private String plz;

    /**
     * Der Standort der Firma
     */
    private String ort;

    /**
     * Das Bundesland, in dem die Firma ansässig ist
     */
    private Bundesland bundesland;
    // ...


    public Firma(String name, String registernummer, String registergericht,
                 String plz, String ort, Bundesland bundesland) {
        this.name = name;
        this.registernummer = registernummer;
        this.registergericht = registergericht;
        this.plz = plz;
        this.ort = ort;
        this.bundesland = bundesland;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegisternummer() {
        return registernummer;
    }

    public void setRegisternummer(String registernummer) {
        this.registernummer = registernummer;
    }

    public String getRegistergericht() {
        return registergericht;
    }

    public void setRegistergericht(String registergericht) {
        this.registergericht = registergericht;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public Bundesland getBundesland() {
        return bundesland;
    }

    public void setBundesland(Bundesland bundesland) {
        this.bundesland = bundesland;
    }
}
