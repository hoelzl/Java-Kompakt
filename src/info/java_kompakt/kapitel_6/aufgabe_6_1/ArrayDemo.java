/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_6.aufgabe_6_1;

/**
 * Die Klasse <code>ArrayDemo</code> dient zur Erklärung von Deklaration und Initializierung
 * von eindimensionalen Arrays. Einfachheitshalber werden wir die Arrays in die Main Methode als lokale Variablen
 * deklarieren und initializieren. Will man die Daten in einem Array im ganzen Programm sichtbar haben, so muss
 * man natürlich das Array als Instanzvariablen deklarieren.
 *
 * @author Allaithy Raed (raed@pst.ifi.lmu.de)
 */
public class ArrayDemo {

    public static void main(String[] args){

        // Deklaration und Initializierung in einem Schritt:
        int[] geradeDirekt = {0, 2, 4, 6, 8, 10};
        int[] ungeradeDirekt = {1, 3, 5, 7, 9};
        int[] primDirekt = {1, 2, 3, 5, 7};


        // Deklaration
        int[] gerade;
        // Erzeugung und Platz für 6 Array Speicherzellen mit new reservierung
        gerade = new int[6];
       // Initialsierung einzeler Array-Zellen mit arrayName[index] = wert;
        gerade[0] = 0;
        gerade[1] = 2;
        gerade[2] = 4;
        gerade[3] = 6;
        gerade[4] = 8;
        gerade[5] = 10;

        // Analog mit ungerade und Primzahlen
        int[] ungerade = new int[5]; // Deklaration und Platz reservieren in einem Schritt
        ungerade[0] = 1;
        ungerade[1] = 3;
        ungerade[2] = 5;
        ungerade[3] = 7;
        ungerade[4] = 9;

        int[] prim = new int[5];
        prim[0] = 1;
        prim[1] = 2;
        prim[2] = 3;
        prim[3] = 5;
        prim[4] = 7;

        // Ein paar Beispiele: Werte auf die Konsole ausgeben:

        //Gib den gespeicherten Wert in geradeDirekt unter Index 3
        System.out.println("geradeDirekt[3] = " + geradeDirekt[3]) ; //Gibt 6 aus.


        //Gib den gespeicherten Wert in ungeradeDirekt unter Index 0
        System.out.println("ungeradeDirekt[3] = " + ungeradeDirekt[0]) ; //Gibt 1 aus.

        //Gib den gespeicherten Wert in prim unter Index 4
        System.out.println("prim[4] = " + prim[4]) ; //Gibt 7 aus.


    }
}
