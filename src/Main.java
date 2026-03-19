/**
Erstelle dein Programm über Blockly und
klicke auf 'Play', um es auszuführen!
*/

public class Main { 
    public static void main() {
        aufgabe1();
        aufgabe2(123, 124);
        aufgabe3();
    }

    public static void aufgabe1() {
        String eingabe = Input.readString("Gib was ein:");

        if ("Hallo" == eingabe) {
            System.out.println("Servus!");
        }
        else {
            System.out.println("Keine Ahnung, was du willst.");
        }
    }

    public static void aufgabe3() {
        for (int i = 1; i < 26; i++) {
            for (int j = 1; j < 26; j++) {
                double ergebnis = i * j;

                if (ergebnis < 10) {
                    System.out.print("00");
                    System.out.print(ergebnis);
                }
                else if (ergebnis < 100) {
                    System.out.print("0");
                    System.out.print(ergebnis);
                }
                else {
                    System.out.print(ergebnis);
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    /**
     * Das Hauptprogramm (main-Methode):
     * Alles, was ausgeführt werden soll,
     * muss in diese Methode eingefügt werden.
     * Objekte erstellen, Methoden aufrufen, ...
     *
     * Das Hauptprogramm wird automatisch
     * gestartet, wenn du auf 'Play' drückst.
     */
    public static void aufgabe2(double zahl1, double zahl2) {

        if (zahl1 > zahl2) {
            System.out.println(zahl1+">"+zahl2);
        }
        else if (zahl1 < zahl2) {
            System.out.println(zahl1+"<"+zahl2);
        }
        else {
            System.out.println(zahl1+"="+zahl2);
        }
    }

}


// main()-Methode starten
Main.main();