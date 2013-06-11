/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_6.aufgabe_6_3;
/**
 * Die Klasse <code>ArrayDemo2</code> dient zur Erklärung von Deklaration und Initializierung
 * von mehrdimensionalen Arrays. Einfachheitshalber werden wir die Arrays in die Main Methode als lokale Variablen
 * deklarieren und initializieren. Will man die Daten in einem Array im ganzen Programm sichtbar haben, so muss
 * man natürlich das Array als Instanzvariablen deklarieren.
 *
 * @author Allaithy Raed (raed@pst.ifi.lmu.de)
 */
public class ArrayDemo2 {

     public static void main(String[] args){

         // Ein mehrdimensionales Array für gerade, ungerade und Primzahlen zwischen 0-10
         // Deklaration und Initialisierung in einem Schritt.
         // Zweidimensionales Array der Länge 3 ist nötig
         // zahlenDirekt[0][x] gerade Zahlen // x ist von 0 bis 5
         // zahlenDirekt[1][y] ungerade Zahlen // y ist von 0 bis 4
         // zahlenDirekt[2][z] Primzahlen // z ist von 0 bis 4.

                          // zahlenDirekt[0][x] , zahlenDirekt[1][y], zahlenDirekt[2][z]
         int[][] zahlenDirekt = { {0,2,4,6,8,10}, {1,3,5,7,9}, {1,2,3,5,7} };
         // Zugriff auf das [i][j] Element mit zahlenDirekt[i][j]. Beispiele:
         System.out.println("zahlenDirekt[0][4] = " + zahlenDirekt[0][4]); // Gibt 8 aus
         System.out.println("zahlenDirekt[1][3] = " + zahlenDirekt[1][3]); // Gibt 7 aus
         System.out.println("zahlenDirekt[2][0] = " + zahlenDirekt[2][0]); // Gibt 1 aus
          System.out.println(zahlenDirekt.length); // Gibt 3 aus.



         // Deklaration und Initialisierung mit new

         // Deklaration von einem zwei dimensionalen Array der Länge 3.
         int[][] zahlen = new int[3][];
         System.out.println(zahlen.length); // Gibt 3 aus.

         // Deklaration und Platzreserivierung des ersten inneren Arrays für gerade Zahlen
         zahlen[0] = new int[6];
         // Deklaration und Platzreserivierung des zweiten inneren Arrays für ungerade Zahlen
         zahlen[1] = new int[5]; // Dekl
         // Deklaration und Platzreserivierung des dritten inneren Arrays für Prim Zahlen
         zahlen[2] = new int[5];

         // Jetzt Werte zuweisen: Erstes inneres Array (Gerade zahlen):
         zahlen[0][0] = 0;
         zahlen[0][1] = 2;
         zahlen[0][2] = 4;
         zahlen[0][3] = 6;
         zahlen[0][4] = 8;
         zahlen[0][5] = 10;



         // Jetzt Werte zuweisen: zweites inneres Array (Ungerade zahlen):
         zahlen[1][0] = 1;
         zahlen[1][1] = 3;
         zahlen[1][2] = 5;
         zahlen[1][3] = 7;
         zahlen[1][4] = 9;


         // Jetzt Werte zuweisen: Drittes inneres Array (Primzahlen zahlen):
         zahlen[2][0] = 1;
         zahlen[2][1] = 2;
         zahlen[2][2] = 3;
         zahlen[2][3] = 5;
         zahlen[2][4] = 7;


    // Jetzt Zugriff auf das [i][j] Element
    System.out.println("zahlen[0][4] = " + zahlen[0][4]); // Gibt 8 aus
    System.out.println("zahlen[1][3] = " + zahlen[1][3]); // Gibt 7 aus
    System.out.println("zahlen[2][0] = " + zahlen[2][0]); // Gibt 1 aus


    // Allgemein gilt:
    // anlegen von speicherplatz für mehrdimensionale Arrays
    int[] array = new int[3];
    int[][] twoDimArray = new int[3][];
    int[][][] threeDimArray = new int[3][][];
    // es muss immer nur die 'länge' der ersten dimension angegeben werden
    int[][][][] fourDimArray = new int[3][][][];
     }
}
