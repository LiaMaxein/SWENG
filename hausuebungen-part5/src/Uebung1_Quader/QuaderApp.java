package Uebung1_Quader;

public class QuaderApp {
    public static void main(String[] args) {

        // Test-Quader
        Quader quader = new Quader(2,3,4);

        // Zeig mir die aktuellen Dimensionen des Quaders
        quader.anzeige();

        //Berechne & zeig mir die Grundfläche an
        quader.grundflaeche();
        System.out.println("\nDie Grundfläche beträgt: "+quader.grundflaeche()+" 📐");

        // Volumen Test mit Harris-Werten
        quader.volumen();
        System.out.println("\nDas Volumen des Quaders beträgt: "+quader.volumen()+"️ ⬜️ ");

        // Oberfläche Test mit Harris-Werten
        quader.oberflaeche();
        System.out.println("\nDie Oberfläche des Quaders beträgt: "+quader.oberflaeche()+"️ ⬜️ ");

        // Skalieren des Quaders um den Faktor XY & erneute anzeige
        quader.skaliere(4);

        //Erneute anzeige der Quader-Daten nach der Skalierung
        quader.anzeige();
        quader.grundflaeche();

        //Jetzt das Volumen berechnen
        quader.volumen();
        System.out.println("\nDas Volumen des Quaders beträgt: "+quader.volumen()+"️ ⬜️ ");


    }
}
