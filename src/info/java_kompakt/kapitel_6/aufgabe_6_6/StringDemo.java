/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_6.aufgabe_6_6;

/**
 * Die Klasse <code>StringDemo</code> repräsentiert das Arbeiten mit String Zeichenketten.
 * @author Allaithy Raed (raed@pst.ifi.lmu.de)
 */
public class StringDemo {

    public static void main(String[] args) {

        String s1 = "Hamburg";
        String s2 = "Ho" + s1.substring(2,7);
        String s3 = "Homburg";


        System.out.println("s1 ist: " + s1);   // Gibt Hamburg aus
        System.out.println("s2 ist: " + s2);   // Gibt Homburg aus
        System.out.println("s3 ist: " + s3);   // Gibt Homburg aus

        // s2==s3 Positionstest: testet ob die Strings s2 und s3 in der selben Position sind
        System.out.println("s2==s3: " + (s2==s3)); // Gibt false aus


        // s2.equals(s3) Gleichheitstest: testet ob die Strings s2 und s3 den gleichen Inhalt haben
        System.out.println("s2.equals(s3): " + s2.equals(s3)); // Gibt true aus




    }
}
