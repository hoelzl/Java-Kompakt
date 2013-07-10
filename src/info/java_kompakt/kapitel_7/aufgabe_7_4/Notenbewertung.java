package info.java_kompakt.kapitel_7.aufgabe_7_4;


import java.util.Scanner;
/**
 * Die Klasse <code>Notenbewertung</code> demonstriert die Fallunterscheidung mit switch, case, break Anweisungen.
 * @author Allaithy Raed (raed@pst.ifi.lmu.de)
 */

public class Notenbewertung {


    /**
     * Die Methode read() liest die Note als double Zahl von der Konsole ein
     * und liefert sie als ihre Rückgabe zurück.
     * @return die Note als double Zahl.
     */
   private double read(){
        // Ein Scanner Objekt zum Einlesen von der Konsole
        Scanner s = new Scanner(System.in);
        // Einlesen von einer double Zahl und Speichern in gehalt
       double note = s.nextDouble();
        return note;
    }


    /**
     * Diese Hilfsmethode bildet eine double Note auf eine Integer Note ab.
     * Dabei gilt:
     * Note -1 : für Noten kleiner als 1 (Ungültige Angabe)
     * Note 1: für Noten zwischen 1 und 1.5 anschließend.
     * Note 2: für Noten großer 1.5 und kleiner gleich 2.5
     * Note 3: für Noten großer 2.5 und kleiner gleich 3.5
     * Note 4: für Noten großer 3.5 und kleiner gleich 4.5
     * Note 5: für Noten großer 4.5 und kleiner gleich 5.5
     * Note 6: für Noten großer 5.5 und kleiner gleich 6
     * Note 7: Für Noten großer als 6 (Ungültige Angabe!)
     * @return die Note als Integer
     */
    private int getNoteAlsInt(double note){

        if(note < 1){  // Alle Noten kleiner 1 werden auf -1 abgebildet.
            return -1;
        }
        if(note <= 1.5){ // Alle Noten zwischen 1 und 1.5  werden auf 1 abgebildet.
            return 1;
          }

        if(note > 1.5 && note <=2.5){   // Alle Noten zwischen 1.5 und 2.5.5  werden auf 2 abgebildet.
            return 2;
        }
        if(note > 2.5 && note <= 3.5){   // Alle Noten zwischen 1.5 und 2.5.5  werden auf 2 abgebildet.
            return 3;
        }

        if(note > 3.5 && note <= 4.5){
            return 4;
        }

        if(note > 4.5 && note <= 5.5){
            return 5;
        }

        if(note > 5.5 && note <= 6){
            return 6;
        }

        else{
            return 7;
        }
    }


    /**
     * Die Methode bewerteSchuelerin bewertet eine aus der Konsole eingelesene Note
     * und liefert anhand der Note wie gut die Schülerin ist.
     */
    public void bewerteSchuelerin(){

        // Lese die Note aus der Konsole mit Hilfe der bereits implementierten read() Methode von oben.
        double note = read();
        System.out.println("Note " + note);
        // Caste die Double Note zu Integer mit Hilfe unserer getNoteAlsInt(double) Methode.
        int noteAlsInt = getNoteAlsInt(note);
        System.out.println("Note Als Int: " + noteAlsInt);

        switch(noteAlsInt){
            case 1: System.out.println("Die Schülerin ist sehr gut"); break;
            case 2: System.out.println("Die Schülerin ist gut"); break;
            case 3:
            case 4: System.out.println("Die Schülerin ist durchschnittlich"); break;
            case 5:
            case 6: System.out.println("Die Schülerin ist schlecht"); break;
            default: System.out.println("Ihre Notenangabe ist ungültig!");
        }

    }




    public static void main(String[] args){
        Notenbewertung notenbewertung = new Notenbewertung();
        // In der Konsole benutzen Sie bitte die Format x,xx für Double also mit Komma und nicht mit Punkt!
        // Zum Beispiel: 3,9  und nicht 3.9 denn sonst gibt es eine Fehlermeldung!
        notenbewertung.bewerteSchuelerin();
    }
}
