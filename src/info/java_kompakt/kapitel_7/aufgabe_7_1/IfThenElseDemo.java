/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_7.aufgabe_7_1;

import java.util.Scanner;

/**
 * Die Klasse <code>IfThenElseDemo</code> demonstriert die Fallunterscheidung mit if else Anweisungen.
 * @author Allaithy Raed (raed@pst.ifi.lmu.de)
 */
public class IfThenElseDemo {

    /**
     * Die Methode ausgehen() liest eine Zahl von der Konsole, die der Benutzer eingibt
     * und entscheidet anhand der angegebener Zah eine der beiden möglichen Nachrichten
     * auf die Konsole auszugeben. Es ist eine klassische Fallunterscheidung.
     */
    public void ausgehen(){
        // Ein Scanner Objekt zum Einlesen von der Konsole
        Scanner s = new Scanner(System.in);
        // Ein integer Zahl wird von der Konsole eingelesen.
        int z = s.nextInt();
       // Wenn die Zahl gleich 1 ist, dann gib die Nachricht: Lass uns in den Englischen Garten gehen
       // Sonst (die Zahl ist ungleich 1) gibt die Nachricht: Oh, jeh, es regenet, lass uns zu Hause Karten spielen!
        if(z==1){
            System.out.println("Lass uns in den Englischen Garten gehen");
        } else{
            System.out.println("Oh, jeh, es regenet, lass uns zu Hause Karten spielen!");
        }

    }



    public static void main(String[] args){

        // Erzeuge ein Objekt demo mit dem Standardkonstruktor
        IfThenElseDemo demo = new IfThenElseDemo();
        // Rufe die Methode ausgehen auf.
        demo.ausgehen();
    }


}
