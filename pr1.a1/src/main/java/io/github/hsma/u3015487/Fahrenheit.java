package io.github.hsma.u3015487;

// Demo Programm für die erste Übung

import java.util.Scanner;

// Programm zur Berechnung der Celsius Temperatur
// bei bekannter Fahrenheit Temperatur
public class Fahrenheit {

    public static void main(String[] args) {

        // Benötigte Variablen deklarieren
        double epsilon = 1.005;
        double f = 0.0, c;

        // Für die Eingabe von der Tastatur
        Scanner in = new Scanner(System.in);

        // Berechnungsschleife
        do {
            // Anleitung
            System.out.println("Programm endet durch Eingabe von 1");
            System.out.println("Eingabe der Fahrenheit-Temperatur: ");
            // Eingabe, Double-Wert einlesen
            f = in.nextDouble();
            // Umrechnen in Celsius
            c = (f - 32.0) * 5.0 / 9.0;
            // Ausgabe des Ergebnis
            System.out.println("... in Celsius: " + c + " Grad \n");
            // Schleife durch Eingabe von 1 verlassen?
        } while (Math.abs(f) > epsilon);

        System.out.println("... und tschüss");
        in.close();
    }
}
