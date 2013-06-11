/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_6.aufgabe_6_4;

/**
 * Die Klasse <code>Kurs</code> repräsentiert einen Kurs.
 * Ein Kurs hat einen Namen vom Typ String und ein Id von Typ int
 * @author Allaithy Raed (raed@pst.ifi.lmu.de)
 */

public class Kurs {

    String name;
    int id;

    // Default Konstruktor
    public Kurs(){

    }

    // Konstruktor, der den Namen und die Id setzt.


    public Kurs(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter und Setter Methoden

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Main Methode mit einem zweidimensionalen Array vom Typ Kurs
   public static void main(String[] args){

       Kurs[][] kurse = new Kurs[2][];

       // Wintersemester ist kurse[0] und hat 2 Kurse java und eclipse
       kurse[0] = new Kurs[2];
       Kurs java = new Kurs("Java", 1);
       Kurs eclipse = new Kurs("Eclipse", 2);

       // Wintersemesterkurse dem Array kurse[0][x] zuweisen
       kurse[0][0] = java;
       kurse[0][1] = eclipse;

       // Sommersemester ist kurse[1] und hat 3 Kurse: datenstrukturen, php und javaScript
       kurse[1] = new Kurs[3];
       // Wir machen direkte Zuweisung mit anonymen Objekten
       kurse[1][0] = new Kurs("Datenstrukturen", 3);
       kurse[1][1] = new Kurs("PHP", 4);
       kurse[1][2] = new Kurs("JavaScript", 5);


       // Kurs aus dem Wintersemester ausdrucken mal durch objekt.attribut bzw. objekt.getAttribut
       System.out.println(kurse[0][0].getName()); // Gibt java aus
       System.out.println(kurse[0][1].name); // Gibt Eclipse aus.

       // Kurs aus dem Sommersemester ausdrucken mal durch objekt.attribut bzw. objekt.getAttribut
       System.out.println(kurse[1][1].getName()); // Gibt PHP aus
       System.out.println(kurse[1][2].name); // Gibt JavaScript aus.


   }

}
