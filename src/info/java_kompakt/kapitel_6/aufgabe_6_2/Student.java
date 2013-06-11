/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_6.aufgabe_6_2;

/**
 * Die Klasse <code>Student</code> repräsentiert einen Studenten.
 * Da wir in den vorherigen Lösungen die Getter und Setter Methoden
 * sowie Konstruktoren ausführlich dokumentiert haben, verzichten wir
 * auf ausführliche Dokumentation. Übrigens auch in großen Projekten
 * werden Setter und Getter Methoden sowie Konstruktoren selten dokumentiert
 * da es sich um eine einfache Routine handelt und kaum Logik drin steht.
 * @author Allaithy Raed (raed@pst.ifi.lmu.de)
 */

public class Student {

    private String name;
    private String matrikelnr;
    private String fach;
    private int semester;


    // Die Getter und Setter Methoden

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatrikelnr() {
        return matrikelnr;
    }

    public void setMatrikelnr(String matrikelnr) {
        this.matrikelnr = matrikelnr;
    }

    public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    // Der Default Konstruktor:
    public Student(){

    }

    // Ein Konstruktor, der alle Attribute setzt.
    public Student(String name, String matrikelnr, String fach, int semester) {
        this.name = name;
        this.matrikelnr = matrikelnr;
        this.fach = fach;
        this.semester = semester;
    }

    // Die Main Methode mit einem Array von Studenten
    public static void main(String[] args){

        Student[] studenten = new Student[4];

        // Aufgabe: Weisen Sie den Elementen des Arrays studenten Objektreferenzen auf Studenten zu.

        // Lösung 1: Ein Objekt vom Typ Student erzeugen und dem Array zuweisen:
        Student student1 = new Student("Mustermann", "1234", "Informatik", 1);
        Student student2 = new Student("Mueller", "4321", "Bio-Informatik", 2);
        studenten[0] = student1; // Nun refernziert studenten[0] auf das Student-Objekt student1
        studenten[1] = student2; // Nun refernziert studenten[1] auf das Student-Objekt student2

        // Lösung 2: Dirkete Zuweisung mit "anonymen" Student Objekten
        studenten[2] = new Student("Berger", "5021", "Medien-Informatik", 3);
        studenten[3] = new Student("Zimmermann", "7041", "Wirtschafts-Informatik", 1);

        // Um die einzelnen Daten in der selben Klasse auszugeben muss man: Array[index].Instanzvariable
        // bzw. Array[index].getInstanzvariable aus anderen Klassen:

        System.out.println("studenten[0].name: " + studenten[0].name);     // Gibt Mustermann aus
        System.out.println("studenten[0.fach: " + studenten[0].getFach()); // Gibt Informatik aus

    }


}
