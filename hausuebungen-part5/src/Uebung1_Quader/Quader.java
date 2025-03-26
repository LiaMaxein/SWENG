package Uebung1_Quader;

public class Quader {
    private double laenge;
    private double breite;
    private double hoehe;

    // Erstellen Objekt Quader = Konstruktor
    public Quader(double laenge, double breite, double hoehe) {
    this.laenge = laenge;
    this.breite = breite;
    this.hoehe = hoehe;
    }

    // Methode zur Grundfläche
    public double grundflaeche() {
        return laenge * breite;
    }

    // Methode die alles um einen Faktor vergrößert oder verkleinert
    public void skaliere(double faktor) {
        if (faktor > 0) {   // so gibt's keine negative Skalierung
            laenge *= faktor;
            breite *= faktor;
            hoehe *= faktor;
            System.out.println("\n☑️Der Quader wurde skaliert.");
        } else {
            System.out.println("\n🚨Der Faktor muss positiv sein!");
        }
    }

    // Methode um mir die aktuelle Dimension des Quaders anzuzeigen
    public void anzeige() {
        System.out.println("\nDer Quader hat eine Länge von "+laenge+" 📏 " +
                "\n& eine Breite von "+breite+" 📏 " +
                "\n sowie eine Höhe von "+hoehe+" 📏");
    }

    // Methode für das Volumen
    public double volumen() {
        return laenge*breite*hoehe;
    }

    // Methode für die Oberfläche
    public double oberflaeche() {
        return 2*(laenge*breite)+2*(laenge*hoehe)+2*(breite*hoehe);
    }

}
