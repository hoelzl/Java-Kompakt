/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_3.aufgabe_3_1;

import java.util.ArrayList;

/**
 * Die Klasse <code>Firma</code> repräsentiert eine Firma.
 *
 * @author Matthias Hölzl (tc@xantira.com)
 */
public class Firma {

    ////////////////////////////////////////////////////////////////////
    // Instanzvariablen
    ////////////////////////////////////////////////////////////////////

    /**
     * Der Name der Firma.
     */
    String name;

    /**
     * Die Branche, in der die Firma aktiv ist.
     */
    String branche;

    /**
     * Alle Mitarbeiter der Firma.
     */
    ArrayList<Mitarbeiter> mitarbeiter;

    ////////////////////////////////////////////////////////////////////
    // Konstruktor
    ////////////////////////////////////////////////////////////////////

    /**
     * Konstruktor, der neue <code>Firma</code>-Instanzen erzeugt.
     *
     * @param name Der Name der Firma
     * @param branche Die Branche, in der die Firma tätig ist
     */
    public Firma(String name, String branche) {
        this.name = name;
        this.branche = branche;
        mitarbeiter = new ArrayList<Mitarbeiter>();
    }

    ////////////////////////////////////////////////////////////////////
    // Setter
    ////////////////////////////////////////////////////////////////////

    /**
     * Setter für das Attribut <code>name</code>.
     *
     * @param name Der neue Name der Firma
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter für das Attribut <code>Branche</code>
     *
     * @param branche Die neue Branche der Firma
     */
    public void setBranche(String branche) {
        this.branche = branche;
    }

    /**
     * Setter für das Attribut <code>mitarbeiter</code>.
     *
     * @param mitarbeiter Die neue Liste der Mitarbeiter der Firma
     */
    public void setMitarbeiter(ArrayList<Mitarbeiter> mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    ////////////////////////////////////////////////////////////////////
    // Methoden
    ////////////////////////////////////////////////////////////////////

    /**
     * Gibt Informationen über die Firma auf der Konsole aus.
     */
    public void druckeInfo() {
        System.out.format("Firma: %s, %s, hat %d Mitarbeiter\n",
                name, branche, mitarbeiter.size());
    }
}
