/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_6.aufgabe_6_5;

/**
 * Die Klasse <code>EnumDemo</code> repräsentiert das Arbeiten mit Aufzählungstypen
 * sie speichert eine Instanzvariable vom Typ Enumeration und initialisiert sie.
 * @author Allaithy Raed (raed@pst.ifi.lmu.de)
 */

public class EnumDemo {

    // Instanzvariable zum Speichern von einem Tag
    private Tag wochentag;

    // Getter und Setter für Wochentag


    public Tag getWochentag() {
        return wochentag;
    }

    public void setWochentag(Tag wochentag) {
        this.wochentag = wochentag;
    }

    public static void main(String[] args){

        // Erzeugen eines EnumDemo Objekts (Instanz) mit dem Default-Konstruktor
        EnumDemo enumDemo = new EnumDemo();
        enumDemo.setWochentag(Tag.MO);
        // Alternative wäre der direkte Zugriff: Objektname.Instanzvariable
        // enumDemo.wochentag = Tag.MO;
        System.out.println("enumDemo.wochentag: " + enumDemo.wochentag); // Gibt Mo aus.


       // Die vordefinierte Methode values() liefert die Enumeration Tag als Array der Länge
       // 7 (Anzahl die Wochentage MO bis SO) zurück Das Array speichern wir in die Array-Variable alleTage
       Tag[] alleTage = Tag.values();

       // Alle Elemente des Arrays alleTage ausgeben:
        System.out.println("alleTage[0] = " + alleTage[0]);
        System.out.println("alleTage[1] = " + alleTage[1]);
        System.out.println("alleTage[2] = " + alleTage[2]);
        System.out.println("alleTage[3] = " + alleTage[3]);
        System.out.println("alleTage[4] = " + alleTage[4]);
        System.out.println("alleTage[5] = " + alleTage[5]);
        System.out.println("alleTage[6] = " + alleTage[6]);


    }
}
