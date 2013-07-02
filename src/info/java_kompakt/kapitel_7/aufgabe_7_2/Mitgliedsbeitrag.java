/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_7.aufgabe_7_2;


import java.util.Scanner;

/**
 * Die Klasse <code>Mitgliedsbeitrag</code> demonstriert die Fallunterscheidung mit geschachtelten if else Anweisungen.
 * So dass nur eine von mehreren Alternativen ausgewählt wird.
 * @author Allaithy Raed (raed@pst.ifi.lmu.de)
 */

public class Mitgliedsbeitrag {

    // Instanzvariable zum Speichern von einem Gehalt
    private double gehalt;


    // Ein Konstruktor, der die Instanzvariable beim Erzeugen setzt.
    public Mitgliedsbeitrag(double gehalt) {
        this.gehalt = gehalt;
    }

    // Der Standardkonstrukor, den wir explizit eingeben müssen, da wir unseren eigenen Konstruktor
    // bereits definiert haben.
    public Mitgliedsbeitrag(){

    }

    // Getter and Setter Methoden


    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    /**
     * Die Methode readGehalt liest eine doulbe Zahl als Gehalt von der Konsole ein
     * und speichert sie in der Instanzvariable gehalt.
      */
    public void readGehalt(){
        // Ein Scanner Objekt zum Einlesen von der Konsole
        Scanner s = new Scanner(System.in);
        // Einlesen von einer double Zahl und Speichern in gehalt
        gehalt = s.nextDouble();
    }


    /**
     * Die Methode berechneMitgliedsbeitrag entscheidet anhand von dem Wert, der in die Instanzvariable
     * gehalt gespeichert ist, für eine von mehreren Alternativen. Um eine Alternative von mehreren
     * zu realisieren brauchen wir in Java die geschachtelte if-else Fallunterescheidungen
     */
    public void berechneMitgliedsbeitrag(){
        // Ist Gehalt > 48000 dann Mitgliedsbeitrag ist 300
         if(gehalt > 48000){
             System.out.println("Ihr Mitgliedsbeitrag ist 300 Euro/Jahr");
         } else if(gehalt > 38000){  // Ist Gehalt > 38000 dann Mitgliedsbeitrag ist 200
             System.out.println("Ihr Mitgliedsbeitrag ist 200 Euro/Jahr");
         } else if(gehalt > 32000){  // Ist Gehalt > 32000 dann Mitgliedsbeitrag ist 100
        System.out.println("Ihr Mitgliedsbeitrag ist 100 Euro/Jahr");
    }   else {  // Sonst, also gehalt kleiner als 32.000 dann Mitgliedsbeitrag ist 20
             System.out.println("Ihr Mitgliedsbeitrag ist 20 Euro/Jahr");
         }
    }



    /**
     * Die Methode berechneMitgliedsbeitrag2() ist aus berechneMitgliedsbeitrag1() entstanden,
     * in dem wir statt else if Nur if geschrieben haben! Natürlich ist das fehlerhafte Implementation!
     * Probieren Sie es dann, in dem Sie die Methode berechneMitgliedsbeitrag2()
     * in der Main Methode aktivieren, und das Programm erneuet ausführen!
     */
    public void berechneMitgliedsbeitrag2(){
        // Ist Gehalt > 48000 dann Mitgliedsbeitrag ist 300
        if(gehalt > 48000){
            System.out.println("Ihr Mitgliedsbeitrag ist 300 Euro/Jahr");
        } else if(gehalt > 38000){  // Ist Gehalt > 38000 dann Mitgliedsbeitrag ist 200
            System.out.println("Ihr Mitgliedsbeitrag ist 200 Euro/Jahr");
        } else if(gehalt > 32000){  // Ist Gehalt > 32000 dann Mitgliedsbeitrag ist 100
            System.out.println("Ihr Mitgliedsbeitrag ist 100 Euro/Jahr");
        }   else {  // Sonst, also gehalt kleiner als 32.000 dann Mitgliedsbeitrag ist 20
            System.out.println("Ihr Mitgliedsbeitrag ist 20 Euro/Jahr");
        }
    }


    /**
     * Aufgabe 7.2 Teil 2. Lösung
     *  Die Methode berechneMitgliedsbeitrag3() implementiert die modifizierte Anforderung:
     *  Ist Gehalt > 48000 dann Mitgliedsbeitrag ist 300
     *  Ist Gehalt > 38000 und kleiner gleich als 48.0000 dann Mitgliedsbeitrag ist 200
     *  Ist Gehalt > 32000 und kleiner gleich als 38.0000 dann Mitgliedsbeitrag ist 100
     *  Ist Gehalt kleiner als 32.000 dann Mitgliedsbeitrag ist 20
     *
     * Die Methode benutzt nur  if ohne else.
     * Probieren Sie es dann, in dem Sie die Methode berechneMitgliedsbeitrag2()
     * in der Main Methode aktivieren, und das Programm erneuet ausführen!
     */
    public void berechneMitgliedsbeitrag3(){
        // Ist Gehalt > 48000 dann Mitgliedsbeitrag ist 300
        if(gehalt > 48000){
            System.out.println("Ihr Mitgliedsbeitrag ist 300 Euro/Jahr");
        }
        // Ist Gehalt > 38000 und kleiner gleich als 48.0000 dann Mitgliedsbeitrag ist 200
        if(gehalt > 38000 && gehalt <= 48000){
            System.out.println("Ihr Mitgliedsbeitrag ist 200 Euro/Jahr");
        }
        // Ist Gehalt > 32000 und kleiner gleich als 38.0000 dann Mitgliedsbeitrag ist 100
        if(gehalt > 32000 && gehalt <= 38000 ){
            System.out.println("Ihr Mitgliedsbeitrag ist 100 Euro/Jahr");
        }

        // Ist Gehalt kleiner oder gleich als 32.000 dann Mitgliedsbeitrag ist 20
        if(gehalt <= 32000 ) {
            System.out.println("Ihr Mitgliedsbeitrag ist 20 Euro/Jahr");
        }
    }


    public static void main(String[] args){
        Mitgliedsbeitrag mitgliedsbeitrag = new Mitgliedsbeitrag();
        mitgliedsbeitrag.readGehalt();

        /*
         * Aktivieren Sie eine der folgenden Methode, in dem Sie die Kommentarzeichen // davor entfernen
         * und das Programm erneut ausführen!
         */

       // mitgliedsbeitrag.berechneMitgliedsbeitrag();
       // mitgliedsbeitrag.berechneMitgliedsbeitrag2();
       // mitgliedsbeitrag.berechneMitgliedsbeitrag3();

    }

}
