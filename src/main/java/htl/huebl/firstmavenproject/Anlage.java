package htl.huebl.firstmavenproject;

public class Anlage {

    private double anschaffungswert;
    private int nutzungsdauer;
    private double buchwert;

    public Anlage(double anschaffungswert, int nutzungsdauer) {
        this.anschaffungswert = anschaffungswert;
        this.nutzungsdauer = nutzungsdauer;

    }

    public double jahresAfa() {
        return anschaffungswert / nutzungsdauer;
    }

    public void updateBuchwert(int jahreGenutzt) {
        

    }

    public double getBuchwert() {
        return buchwert;
    }

    public double getAnschaffungswert() {
        return anschaffungswert;
    }

    public int getNutzungsdauer() {
        return nutzungsdauer;
    }
    
    

}
