package Uebung3_Auto;

import java.sql.SQLOutput;

public class AutoTestMain {
    public static void main(String[] args) {
        // Test Autos erstellen
        Auto a1 = new Auto("🚙BMW", "M5", 2025);
        Auto a2 = new Auto("🚘Porsche", "911 GT3", 2015);
        Auto a3 = new Auto("🏎️Ferrari", "Daytona SP3", 2021 );

        System.out.println("\nHerzlich Willkommen zu Race Cars! 🛣️ \nHier sind unsere Teilnehmer:" );
        // Alle Autos vorstellen
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println("\nDas Rennen beginnt!");

        // Gas geben
        a1.gasGeben(100);
        a2.gasGeben(70);
        a3.gasGeben(180);

        System.out.println("\nEs kommt eine scharfe Kurve & unsere Teilnehmer steigen auf's Eisen!");
        System.out.println();                   // einfach nur für die Übersicht ;)

        // Bremsen
        a1.bremsen(20);
        a2.bremsen(15);
        a3.bremsen(10);

        System.out.println("\n🏁Die Ziellinie wurde überquert mit Spitzengeschwindigkeiten! \nHier unsere finalen Zeitmessungen: ");

        // Status nach Bremsen
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println("Ferrari gewinnt! 😎😉🏆");

    }
}
