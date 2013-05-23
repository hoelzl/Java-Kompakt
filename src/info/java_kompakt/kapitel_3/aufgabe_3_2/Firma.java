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
 * Die Klasse <code>Firma</code> repräsentiert eine Firma.
 *
 * @author Matthias Hölzl (tc@xantira.com)
 */
public class Firma {

    ////////////////////////////////////////////////////////////////////
    // Instanzvariablen
    ////////////////////////////////////////////////////////////////////

    /**
     * Der Name der Firma.
     */
    String name;

    /**
     * Die Branche, in der die Firma aktiv ist.
     */
    String branche;

    /**
     * Alle Mitarbeiter der Firma.
     */
    ArrayList<Mitarbeiter> mitarbeiter;

    ////////////////////////////////////////////////////////////////////
    // Konstruktor
    ////////////////////////////////////////////////////////////////////

    /**
     * Konstruktor, der neue <code>Firma</code>-Instanzen erzeugt.
     *
     * @param name Der Name der Firma
     * @param branche Die Branche, in der die Firma tätig ist
     */
    public Firma(String name, String branche) {
        this.name = name;
        this.branche = branche;
        mitarbeiter = new ArrayList<Mitarbeiter>();
    }

    ////////////////////////////////////////////////////////////////////
    // Getter und Setter
    ////////////////////////////////////////////////////////////////////

    /**
     * Getter für das Attribut <code>name</code>.
     *
     * @return Der Name der Firma
     */
    public String getName() {
        return name;
    }

    /**
     * Setter für das Attribut <code>name</code>.
     *
     * @param name Der neue Name der Firma
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter für das Attribut <code>branche</code>.
     *
     * @return Die Branche, in der die Firma tätig ist
     */
    public String getBranche() {
        return branche;
    }

    /**
     * Setter für das Attribut <code>Branche</code>
     *
     * @param branche Die neue Branche der Firma
     */
    public void setBranche(String branche) {
        this.branche = branche;
    }

    /**
     * Getter für das Attribut <code>mitarbeiter</code>.
     *
     * @return Die Liste der Mitarbeiter der Firma
     */
    public ArrayList<Mitarbeiter> getMitarbeiter() {
        return mitarbeiter;
    }

    /**
     * Setter für das Attribut <code>mitarbeiter</code>.
     *
     * @param mitarbeiter Die neue Liste der Mitarbeiter der Firma
     */
    public void setMitarbeiter(ArrayList<Mitarbeiter> mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    ////////////////////////////////////////////////////////////////////
    // Methoden
    ////////////////////////////////////////////////////////////////////

    /**
     * Gibt Informationen über die Firma auf der Konsole aus.
     */
    public void druckeInfo() {
        System.out.format("Firma: %s, %s, hat %d Mitarbeiter\n",
                name, branche, mitarbeiter.size());
        for (Mitarbeiter m : mitarbeiter) {
            System.out.format("  %s  \t#%s\t%11.2f€\n",
                    m.getName(), m.getMitarbeiterNr(), m.getGehalt());
        }
    }

    // An dieser Stelle überlegen wir schon einmal, wie wir mit dem Attribut
    // firma verfahren wollen, wenn wir einen Mitarbeiter entlassen.  Wenn wir
    // firma nicht anpassen, so kann eine Mitarbeiter-Instanz nicht feststellen,
    // ob sie gerade für eine Firma arbeitet oder nicht.  Daher setzen wir den
    // Wert von firma auf null, sobald wir einen Mitarbeiter entlassen.
    // Dadurch können wir erreichen, dass die Werte der firma-Attribute von
    // Mitarbeiter-Instanzen und die mitarbeiter-Attribute der entsprechenden
    // Firmen konsistent bleiben.  Beim Einstellen ergeben sich daher drei
    // Fälle: (1) Das Attribut firma des neuen Mitarbeiters ist gleich der
    // Firma, die ihn einstellen will; dieser Fall tritt beim Erzeugen einer
    // neuen Mitarbeiter-Instanz auf. (2) Das Attribut firma ist null, der
    // Mitarbeiter ist also momentan arbeitslos.  (3) Der Mitarbeiter arbeitet
    // im Moment für eine andere Firma.  In diesem Fall stellen wir ihn nicht
    // ein und geben eine Meldung auf der Konsole aus.  (Eine andere
    // Möglichkeit wäre z.B. den Mitarbeiter aus seiner aktuellen Firma zu
    // entfernen und bei der neuen Firma einzustellen.)

    /**
     * Stelle Mitarbeiter <code>m</code> ein, sofern sein Attribut
     * <code>firma</code> mit der aktuellen Firma (<code>this</code>)
     * übereinstimmt oder er momentan arbeitslos ist
     * (<code>firma == null</code>).  Gibt eine Fehlermeldung aus, wenn
     * <code>firma</code> nicht mit <code>this</code> oder <code>null</code>
     * identisch ist.
     *
     * @param m Der neue Mitarbeiter
     * @param mitarbeiterNr Die neue Mitarbeiternummer von <code>m</code>
     * @param gehalt Das Gehalt von <code>m</code>
     */
    public void stelleMitarbeiterEin(Mitarbeiter m, String mitarbeiterNr,
                                     double gehalt) {
        // Erster Fall: Die Firma des Mitarbeiters wurde im Konstruktor gesetzt.
        //
        if (m.getFirma() == this) {
            // Stelle m ein, falls er noch nicht für die Firma arbeitet
            if (!mitarbeiter.contains(m)) {
                m.setMitarbeiterNr(mitarbeiterNr);
                m.setGehalt(gehalt);
                mitarbeiter.add(m);
            }
            // Falls m schon für unsere Firma arbeitet geben wir eine
            // Fehlermeldung aus.
            else {
                System.out.format("Kann Mitarbeiter %s (%s) nicht einstellen: ",
                        m.getName(), m.getMitarbeiterNr());
                System.out.format("er/sie arbeitet schon für %s.\n", name);
            }
        }
        // Zweiter Fall: m ist momentan arbeitslos.
        else if (m.getFirma() == null) {
            // Wir gehen davon aus, dass ein Mitarbeiter mit firma == null nicht
            // in der Liste der Mitarbeiter enthalten sein kann.
            m.setFirma(this);
            m.setMitarbeiterNr(mitarbeiterNr);
            m.setGehalt(gehalt);
            mitarbeiter.add(m);
        }
        // Dritter Fall: m arbeitet momentan für eine andere Firma.
        else {
            System.out.format("Kann Mitarbeiter %s (%s) nicht einstellen: ",
                    m.getName(), m.getMitarbeiterNr());
            System.out.format("er/sie arbeitet für %s.\n", m.getFirma().getName());
        }
    }

    /**
     * Entlasse Mitarbeiter <code>m</code>, sofern er in der Liste der
     * Mitarbeiter vorkommt.  Gibt eine Fehlermeldung aus, wenn das nicht der
     * Fall ist.
     *
     * @param m Der zu entlassende Mitarbeiter
     */
    public void entlasseMitarbeiter(Mitarbeiter m) {
        if (mitarbeiter.contains(m)) {
            mitarbeiter.remove(m);
            m.setFirma(null);
            m.setMitarbeiterNr("");
            m.setGehalt(0.0);
        }
        else {
            System.out.format("Kann Mitarbeiter %s (%s) nicht entlassen, ",
                    m.getName(), m.getMitarbeiterNr());
            System.out.format("da er nicht für Firma %s arbeitet.\n",
                    name);
        }
    }
}
