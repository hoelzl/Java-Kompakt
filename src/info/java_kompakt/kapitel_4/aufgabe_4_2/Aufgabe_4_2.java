/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_4.aufgabe_4_2;

/**
 * Diese Klasse enthält die <code>main</code>-Methode für Aufgabe 4.2.
 * Um die Verwendung von statischen Methoden von außerhalb der definierenden
 * Klasse zu zeigen ist die <code>main</code>-Methode nicht in der Klasse
 * <code>MyConversions</code> enthalten.
 *
 * @author Matthias Hölzl (tc@xantira.com)
 */
public class Aufgabe_4_2 {
    public static void main(String[] args) {
        System.out.format("10 cm entsprechen %.2f Zoll.\n",
                MyConversions.cmNachZoll(10.0));
        System.out.format("10 Zoll entsprechen %.2f cm.\n",
                MyConversions.zollNachCm(10.0));
    }
}
