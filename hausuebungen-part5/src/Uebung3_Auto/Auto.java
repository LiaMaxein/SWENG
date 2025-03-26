package Uebung3_Auto;

public class Auto {
    /*
    folgende Attribute sollen erstellt werden
    - Marke (String)
    -Modell (String)
    - Jahr (Int)
    - Geschwindigkeit (Double)
     */
    private String marke;
    private String modell;
    private int jahr;
    private double geschwindigkeit;

    // Konstruktor - da ich Autos mit verschiedenen Attributen erstellen möchte
    Auto(String marke, String modell, int jahr) {
        this.marke = marke;
        this.modell = modell;
        this.jahr = jahr;
        this.geschwindigkeit = 0; // Standardgeschwindigkeit
    }

    // Getter & Setter
    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    // Methode - Gas geben
    public void gasGeben(double geschw) {
        if (geschw > 0) {         // wenn die geschw größer 0 ist (bzw. die Differenz durch die Betätigung meines Gas-Pedals
            geschwindigkeit += geschw;
            System.out.println("\n🏎️💨Es wurde Gas gegeben! Aktuelle Geschwindigkeit: "+geschwindigkeit+" km/h vom " +marke+"!");
        } else {
            System.out.println("\n🚨Man muss mindestens 1 km/h Gas geben!");
        }
    }

    // Methode - Bremsen
    public void bremsen(double geschw) {
        if (geschw > 0) {
            if (geschwindigkeit - geschw < 0) {
                geschwindigkeit = 0;
            } else {
                geschwindigkeit -= geschw;
            }
            System.out.println("🚦 Es wurde gebremst! Aktuelle Geschwindigkeit: " + geschwindigkeit + " km/h vom "+marke+".");
        } else {
            System.out.println("❌Um zu bremsen, geben sie eine Zahl ein.");
        }
    }

    // Methode Rückgabe Infos Auto plus Geschwindigkeit
    public String toString() {
        return "\nMarke: " + marke + ", Modell: " + modell + ", Jahr: " + jahr + ", Geschwindigkeit: " + geschwindigkeit + " km/h";
    }
}

