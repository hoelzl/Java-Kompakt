/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_7.aufgabe_7_3;


import java.util.Scanner;

/**
 * Die Klasse <code>Mitgliedsbeitrag</code> demonstriert die Fallunterscheidung mit switch, case, break Anweisungen.
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
     * Diese Hilfsmethode ordnet einem Gehalt eine Stufe zu.
     * Dabei gilt:
     * Stufe 1: für Gehälter über 48000
     * Stufe 2: für Gehälter über 38000 (und unter 48000)
     * Stufe 3: für Gehälter über 32000 (und unter 38000)
     * Stufe 4: für Gehälter unter 32000
     *
     * @return die Gehaltsstufe
     */
    private int getGehaltStufe(){
        if(gehalt > 48000){
            return 1;
            // Achtung: hier ist else eigentlich überflüssig. Denn return bedeutet:
            // Liefere den Wert und raus aus der Methode.
        } else if(gehalt > 38000){
            return 2;
        } else if(gehalt > 32000){
            return 3;
        } else{
            return 4;
        }
    }


    /**
     * Die Methode berechneMitgliedsbeitrag entscheidet anhand von dem Wert, der in die Instanzvariable
     * gehalt gespeichert ist, für eine von mehreren Alternativen.
     * Diese Methode benutzt switch case, break.
     * Da case X nur X als integer hier annimmt und kein boolean wie gehalt > 48000 annimmt
     * müssen wir
     */
    public void berechneMitgliedsbeitrag(){
        // Der Aufruf von einer Methode innerhalb einer Methode ist zulässig
        // Das Objekt, dass die Methode getGehaltStufe() aufruft ist dasselbe Objekt,
        // das die Methode berechneMitgliedsbeitrag aufruft und zwar ist es bei getGehaltStufe
        // das implizit this Referenz:  also int getStufe = this.getGehaltStufe();
        // Wobei this auf das Objekt refernziert, das die Methode berechneMitgliedsbeitrag() aufruft.
       int gehaltStufe = getGehaltStufe(); // Ornde dem Gehalt eine Stufe zu
       switch(gehaltStufe){
           case 1:  // Lässt man break weg, so werden alle case Zweige ausgeführt, wenn das Gehalt z.B > 49000
            System.out.println("Ihr Mitgliedsbeitrag ist 300 Euro/Jahr"); break;
           case 2:
               System.out.println("Ihr Mitgliedsbeitrag ist 200 Euro/Jahr"); break;
           case 3:
               System.out.println("Ihr Mitgliedsbeitrag ist 100 Euro/Jahr"); break;
           case 4:  // Hier könnten wir genau so gut default benutzen.
               System.out.println("Ihr Mitgliedsbeitrag ist 20 Euro/Jahr");
        }
    }


    public static void main(String[] args){
        Mitgliedsbeitrag mitgliedsbeitrag = new Mitgliedsbeitrag();
        mitgliedsbeitrag.readGehalt();
        // mitgliedsbeitrag ruft implizit auch die Methode getGehaltStufe
        mitgliedsbeitrag.berechneMitgliedsbeitrag();


    }

}
