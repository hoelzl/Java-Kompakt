/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_4.aufgabe_4_5;

import java.util.Scanner;

/**
 * Klasse mit statischen Methoden zur Berechnung verschiedener mathematischer
 * Funktionen; eine Erweiterung der gleichnamigen Klasse auf Aufgabe 4.5.
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

    public static int berechneFib(int n) {
        if (n <= 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return berechneFib(n-1) + berechneFib(n-2);
        }
    }

    public static boolean istGerade(int n) {
        if (n == 0)
            return true;
        else
            return istUngerade(n-1);
    }

    private static boolean istUngerade(int n) {
        if (n == 0)
            return false;
        else
            return istGerade(n-1);
    }

    /**
     * <code>main</code>-Methode für Aufgabe 4.4.
     *
     * @param args Kommandozeilenargumente
     */
    public static void main(String[] args) {
        System.out.println("istGerade(0):   " + istGerade(0));
        System.out.println("istUngerade(0): " + istUngerade(0));
        System.out.println("istGerade(1):   " + istGerade(1));
        System.out.println("istUngerade(1): " + istUngerade(1));
        System.out.println("istGerade(2):   " + istGerade(2));
        System.out.println("istUngerade(2): " + istUngerade(2));
        System.out.println("istGerade(1000):   " + istGerade(1000));
        System.out.println("istUngerade(1000): " + istUngerade(1000));
        // Führen zu einem StackOverflowError:
        // System.out.println("istGerade(100000):   " + istGerade(100000));
        // System.out.println("istUngerade(100000): " + istUngerade(100000));
    }
}
