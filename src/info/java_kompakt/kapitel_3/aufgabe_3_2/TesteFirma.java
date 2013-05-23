/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_3.aufgabe_3_2;

import java.util.ArrayList;

/**
 * Diese Klasse entält die <code>main</code>-Methode für Aufgabe 3.2.
 *
 * @author Matthias Hölzl (tc@xantira.com)
 */
public final class TesteFirma {
    /**
     * Die <code>main</code>-Methode für Aufgabe 3.2.
     *
     * @param args Die auf der Kommandozeile übergebenen Parameter
     */
    public static void main(String[] args) {

        // Erzeugen einer neuen Instanz der Klasse Firma.
        //
        Firma huber = new Firma("Max Huber & Co", "Haushaltswaren");
        Firma digi = new Firma("DigiWeb", "Web Design");

        // Erzeugen einer neuen Mitarbeiter-Instanz.
        //
        Mitarbeiter max = new Mitarbeiter("Max Huber", "001", huber);

        // Der Chef verdient natürlich mehr als ein normaler Mitarbeiter.
        //
        max.setGehalt(100000.0);

        // Erzeugen von weiteren Mitarbeiter-Instanzen.
        //
        Mitarbeiter sepp = new Mitarbeiter("Sepp Meyer", "002", huber);
        Mitarbeiter julia = new Mitarbeiter("Julia Lange");
        Mitarbeiter joe = new Mitarbeiter("Joe Kurz", "DW1", digi);

        // Ausgabe der Zustände von max und sepp auf der Konsole
        //
        max.druckeInfo();
        sepp.druckeInfo();
        julia.druckeInfo();
        joe.druckeInfo();

        // Der Konstruktor fügt Mitarbeiter jetzt zur Liste der Mitarbeiter der
        // Firma, für die sie arbeiten, hinzu.  Deshalb wird jetzt, im Gegensatz
        // zu Aufgabe 3.1, die korrekte Anzahl an Mitarbeitern ausgegeben, ohne
        // dass wir die Liste manuell aktualisieren müssen.
        //
        System.out.println();
        huber.druckeInfo();
        digi.druckeInfo();

        System.out.println();
        System.out.println("Huber stellt Julia ein:");
        huber.stelleMitarbeiterEin(julia, "003", 20000.0);
        julia.druckeInfo();
        huber.druckeInfo();

        System.out.println();
        System.out.println("Julia beantragt Gehaltserhöhung:");
        julia.beantrageGehaltserhoehung(10.0);
        julia.druckeInfo();

        System.out.println();
        System.out.println("Huber entlässt Sepp:");
        huber.entlasseMitarbeiter(sepp);
        sepp.druckeInfo();
        huber.druckeInfo();

        System.out.println();
        System.out.println("Digi stellt Sepp ein:");
        digi.stelleMitarbeiterEin(sepp, "DW2", 18000.0);
        sepp.druckeInfo();
        huber.druckeInfo();
        digi.druckeInfo();

        System.out.println();
        System.out.println("Digi stellt Sepp nochmal ein - geht nicht:");
        digi.stelleMitarbeiterEin(sepp, "DW2", 18000.0);
        sepp.druckeInfo();
        digi.druckeInfo();

        System.out.println();
        System.out.println("Digi stellt Julia ein - geht nicht:");
        digi.stelleMitarbeiterEin(julia, "DW3", 25000.0);
        julia.druckeInfo();
        digi.druckeInfo();
        huber.druckeInfo();
    }
}
