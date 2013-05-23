/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_4.aufgabe_4_3;

import java.util.Scanner;

/**
 * Klasse mit statischen Methoden zur Berechnung verschiedener mathematischer
 * Funktionen.
 *
 * @author Matthias Hölzl (tc@xantira.com)
 */
public class MyMath {
    /**
     * Berechnet die Fakultät nichtnegativer Zahlen.
     * Gibt für negative Werte das Resultat <code>1</code> zurück.
     *
     * @param n Die Zahl, deren Fakultät berechnet werden soll
     * @return Die Fakultät von <code>n</code>
     */
    public static int berechneFakultaet(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return berechneFakultaet(n - 1) * n;
        }
    }

    /**
     * <code>main</code>-Methode für Aufgabe 4.3.
     *
     * @param args Kommandozeilenargumente
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine positive Zahl ein: ");
        int i = s.nextInt();
        System.out.format("%d! = %d\n", i, berechneFakultaet(i));
    }
}
