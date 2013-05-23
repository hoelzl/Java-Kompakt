/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_4.aufgabe_4_2;

/**
 * Klasse, die statische Methoden zur Konvertierung zwischen verschiedenen
 * Maßeinheiten anbietet.
 *
 * @author Matthias Hölzl (tc@xantira.com)
 */
public final class MyConversions {
    /**
     * Konvertiert das in Zoll angegebene Argument in Centimeter und gibt das
     * Resultat zurück.
     *
     * @param zoll Länge in Zoll
     * @return <code>zoll</code> in Centimeter konvertiert
     */
    public static double zollNachCm(double zoll) {
        return zoll / 2.54;
    }

    public static double cmNachZoll(double cm) {
        return cm * 2.54;
    }
}
