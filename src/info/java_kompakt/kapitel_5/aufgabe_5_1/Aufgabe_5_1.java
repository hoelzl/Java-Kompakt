/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_5.aufgabe_5_1;

/**
 * Die <code>main</code>-Methode zu Aufgabe 5.1.
 *
 * @author Matthias Hölzl (tc@xantira.com)
 */
public class Aufgabe_5_1 {
    public static void main(String[] args) {
        Firma xy = new Firma("XY Company", "Detektei");
        Mitarbeiter joe = new Mitarbeiter("Joe Cool", "003", xy);
        Mitarbeiter jim = new Mitarbeiter("Jimmy Bondy", "006", xy);
        Mitarbeiter eve = new Mitarbeiter("Eve Ill", "123", xy);

        eve.setGehalt(50000.0);
        joe.druckeInfo();
        jim.druckeInfo();
        eve.druckeInfo();
        System.out.println();

        System.out.format("joe.gehaltIstNiedrigerAls(jim):        %s\n",
                joe.gehaltIstNiedrigerAls(jim));
        System.out.format("joe.gehaltIstNiedrigerOderGleich(jim): %s\n",
                joe.gehaltIstNiedrigerOderGleich(jim));
        System.out.format("joe.gehaltIstNiedrigerAls(eve):        %s\n",
                joe.gehaltIstNiedrigerAls(eve));
        System.out.format("joe.gehaltIstNiedrigerOderGleich(eve): %s\n",
                joe.gehaltIstNiedrigerOderGleich(eve));
        System.out.format("eve.gehaltIstNiedrigerAls(jim):        %s\n",
                eve.gehaltIstNiedrigerAls(jim));
        System.out.format("eve.gehaltIstNiedrigerOderGleich(jim): %s\n",
                eve.gehaltIstNiedrigerOderGleich(jim));

        eve.tauscheGehalt(jim);

        System.out.println();
        jim.druckeInfo();
        eve.druckeInfo();
        System.out.println();

        System.out.format("eve.gehaltIstNiedrigerAls(jim):        %s\n",
                eve.gehaltIstNiedrigerAls(jim));
        System.out.format("eve.gehaltIstNiedrigerOderGleich(jim): %s\n",
                eve.gehaltIstNiedrigerOderGleich(jim));
    }
}
