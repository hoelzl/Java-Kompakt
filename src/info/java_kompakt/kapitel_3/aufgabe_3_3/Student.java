/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_3.aufgabe_3_3;

/**
 * Eine Erweiterung der Klasse <code>Student</code> auf S. 75/76 um
 * zusätzliche Konstruktoren.  Außerdem wurde die Methode
 * <code>printStudent</code> überarbeitet um eine übersichtlichere Ausgabe
 * zu erhalten.
 *
 * @author Matthias Hölzl (tc@xantira.com)
 */
public class Student {
    private String name;
    private String adresse;
    private String studienfach;
    private String matrikelnummer;
    private int semester;

    // Konstruktor I
    // Wir haben die neuen Argumente in die Mitte der Argumentliste eingefügt
    // um eine "logischere" Reihenfolge der Parameter zu bekommen: erst werden
    // die persönlichen Informationen des Studenten übergeben, danach
    // diejenigen, die für das Studium relevant sind.
    public Student(String name, String adresse,
                   String matrikelnummer, String studienfach,
                   int semester) {
        this.name = name;
        this.adresse = adresse;
        this.studienfach = studienfach;
        this.matrikelnummer = matrikelnummer;
        this.semester = semester;
    }

    // Konstruktor II
    public Student(String name, String matrikelnummer) {
        this(name, null, matrikelnummer, null, 1);
    }

    // Konstruktor III
    public Student(String name) {
        this(name, null, null, null, 0);
    }

    // Neuer Konstruktor (3)
    // Dieser Konstruktor ist nicht mehr sehr sinnvoll, da er einen
    // Studenten mit Matrikelnummer aber ohne Studienfach erzeugt.
    public Student(String name, String matrikelnummer, int semester) {
        this(name, null, matrikelnummer, null, semester);
    }

    // Neuer Konstruktor (4)
    // Wir haben hier die Reihenfolge der Argumente an die von Konstruktor I
    // angepasst und nicht genau die in der Aufgabenstellung verwendete
    // Reihenfolge verwendet.  Trotzdem ist eine Klasse mit vielen
    // Konstruktoren in der Regel keine gute Idee.  Bereits in diesem einfachen
    // Beispiel sieht man, wie leicht man versehentlich einen falsches
    // Argument übergibt oder die Reihenfolge der Argumente vertauscht
    // (z.B. Matrikelnummer und Studienfach).
    public Student(String name, String matrikelnummer, String studienfach,
                   int semester) {
        this(name, null, matrikelnummer, studienfach, semester);
    }

    // Methode zum Drucken eines Studenten
    public void printStudent() {
        // Um eine etwas übersichtlichere Ausgabe zu erreichen, geben wir
        // nur die Attribute aus, deren Wert nicht `null' sind.
        System.out.print("Student<name: " + name);
        if (adresse != null) {
            System.out.print(", adresse: " + adresse);
        }
        if (studienfach != null) {
            System.out.print(", studienfach: " + studienfach);
        }
        if (matrikelnummer != null) {
            System.out.print(", matrikelnummer: " + matrikelnummer);
        }
        System.out.println(", semester: " + semester + ">");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Sepp");
        Student s2 = new Student("Anne", "67342");
        Student s3 = new Student("Sara", "76345", 5);
        Student s4 = new Student("Gabi", "76346", "Informatik", 3);
        Student s5 = new Student("Alex",
                "Beispielweg 3, 80000 München",
                "12345", "Sozialwissenschaften", 1);
        // Hier sollten Sie noch weitere Studenten erzeugen...

        s1.printStudent();
        s2.printStudent();
        s3.printStudent();
        s4.printStudent();
        s5.printStudent();
        // ... und sie hier ausdrucken.
    }
}
