package info.java_kompakt.kapitel_7.aufgabe_7_5;

import java.util.Scanner;

/**
 * Die Klasse <code>Woche</code>
 * @author Allaithy Raed (raed@pst.ifi.lmu.de)
 */

public class Woche {

    private Wochentag tag;


    /**
     * Die Methode read liest ein Tag als String aus der Konsole ein.
     * Anhand des gelesenen Tages wird die Instanzvariable gesetzt und zwar so,
     * dass sie dengleichen Wochentag bekommt, wie der gelesene String Tag.
     * Achtung: Ausnahmerbehandlung ist nicht dabei! Man muss wirklich den Tag richtig eintippen!
     */
    public void read(){
        // Ein Scanner Objekt zum Einlesen von der Konsole
        Scanner s = new Scanner(System.in);

        String stringTag = s.next();
        if(stringTag.equalsIgnoreCase("Montag")){
         tag = Wochentag.MONTAG;
        }

        if(stringTag.equalsIgnoreCase("Dienstag")){
            tag = Wochentag.DIENSTAG;
        }

        if(stringTag.equalsIgnoreCase("Mittwoch")){
            tag = Wochentag.MITTWOCH;
        }

        if(stringTag.equalsIgnoreCase("Donnerstag")){
            tag = Wochentag.DONNERSTAG;
        }

        if(stringTag.equalsIgnoreCase("Freitag")){
            tag = Wochentag.FREITAG;
        }

        if(stringTag.equalsIgnoreCase("Samstag")){
            tag = Wochentag.SAMSTAG;
        }

        if(stringTag.equalsIgnoreCase("Sonntag")){
            tag = Wochentag.SONNTAG;
        }
    }

    /**
     * Die Methode bewerteTag schreibt ein String Nachricht an die Konsole
     * und zwar in Abhängigkeit von dem eingelesenen Tag aus der Konsole
     */
    public void bewerteTag(){
        read();
        switch(tag){
            case FREITAG : System.out.println("Freitag ist gut"); break;
            case SAMSTAG:
            case SONNTAG: System.out.println("Wochenende ist super!"); break;
            case MONTAG: System.out.println("Montag ist schlecht") ; break;
            default:  System.out.println("Wochenmitte is so la la") ; break;
        }

    }


    public static void main(String[] args){
        Woche woche = new Woche();
        woche.bewerteTag();
    }
}
