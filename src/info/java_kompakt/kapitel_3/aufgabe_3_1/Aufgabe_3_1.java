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
 * In Aufgabe 3.1 werden zwei Klassen <code>Mitarbeiter</code> und
 * <code>Firma</code> implementiert, die Firmen und ihre Mitarbeiter
 * repräsentieren.  Beide Klassen haben Getter und Setter für alle Attribute,
 * aber in dieser Version werden die Daten zwischen Instanzen der beiden Klassen
 * noch nicht konsistent gehalten.  Z.B. wird dem Konstruktor der Klasse
 * <code>Mitarbeiter</code> die Firma, in der der Mitarbeiter arbeitet, als
 * Argument übergeben und in der <code>Mitarbeiter</code>-Instanz gespeichert.
 * In der Firma wird der neue Mitarbeiter dabei aber nicht erfasst, so dass
 * die Liste der Mitarbeiter in <code>Firma</code>-Instanzen leer bleibt, wenn
 * neue Mitarbeiter nicht explizit hinzugefügt werden.
 *
 * @author Matthias Hölzl (tc@xantira.com)
 */
public final class Aufgabe_3_1 {

    /**
     * Die <code>main</code>-Methode für Aufgabe 3.1.
     *
     * @param args Die auf der Kommandozeile übergebenen Parameter
     */
    public static void main(String[] args) {

        // Erzeugen einer neuen Instanz der Klasse Firma.
        //
        Firma huber = new Firma("Max Huber & Co", "Haushaltswaren");

        // Erzeugen einer neuen Mitarbeiter-Instanz.
        //
        Mitarbeiter max = new Mitarbeiter("Max Huber", "001", huber);

        // Der Chef verdient natürlich mehr als ein normaler Mitarbeiter.
        //
        max.setGehalt(100000.0);

        // Erzeugen einer weiteren Mitarbeiter-Instanz.
        //
        Mitarbeiter sepp = new Mitarbeiter("Sepp Meyer", "002", huber);

        // Ausgabe der Zustände von max und sepp auf der Konsole
        //
        max.druckeInfo();
        sepp.druckeInfo();

        // Da wir die Mitarbeiter nicht explizit zur Firma hinzugefügt haben
        // wird hier eine falsche Anzahl von Mitarbeitern ausgegeben.
        //
        huber.druckeInfo();

        // Wir konstruieren die Mitarbeiterliste der Firma "Max Huber & Co"
        // manuell, indem wir alle Mitarbeiter zu einer leeren
        // ArrayList<Mitarbeiter> hinzufügen.  Danach setzen wir diese Liste
        // als Mitarbeiterliste der Firma-Instanz huber.
        // Die Notwendigkeit dafür zeigt, dass unser Programm noch kein
        // gutes Desigh aufweist, da es äußerst fehleranfällig ist, die Liste
        // aller Mitarbeiter in dieser Form zu manipulieren.
        //
        ArrayList<Mitarbeiter> huberMitarbeiter = new ArrayList<Mitarbeiter>();
        huberMitarbeiter.add(max);
        huberMitarbeiter.add(sepp);

        huber.setMitarbeiter(huberMitarbeiter);

        // Jetzt wird die richtige Anzahl an Mitarbeitern ausgegeben.
        huber.druckeInfo();
    }
}
