package proiect.desktop;

public class MemorieRAM extends Componenta 
{ 
    String tipMemorie;
    int capacitate;
    int frecventa;
    double voltaj;
    String latenta;

    MemorieRAM() {
    }

    MemorieRAM(String producator, String tipMemorie, int capacitate, int frecventa, double voltaj, String latenta, double pret) {
        super(producator,pret);
        this.tipMemorie = tipMemorie;
        this.capacitate = capacitate;
        this.frecventa = frecventa;
        this.voltaj = voltaj;
        this.latenta = latenta;
    }
    
    MemorieRAM(MemorieRAM r) {
        super(r);
        this.tipMemorie = r.tipMemorie;
        this.capacitate = r.capacitate;
        this.frecventa = r.frecventa;
        this.voltaj = r.voltaj;
        this.latenta = r.latenta;
    }

    public void setTipMemorie(String tipMemorie) {
        this.tipMemorie = tipMemorie;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public void setFrecventa(int frecventa) {
        this.frecventa = frecventa;
    }

    public void setVoltaj(double voltaj) {
        this.voltaj = voltaj;
    }

    public void setLatenta(String latenta) {
        this.latenta = latenta;
    }

    public String getTipMemorie() {
        return tipMemorie;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public int getFrecventa() {
        return frecventa;
    }

    public double getVoltaj() {
        return voltaj;
    }

    public String getLatenta() {
        return latenta;
    }

    @Override
    public String toString() {
        return getProducator() + " | " + capacitate + "GB | " + tipMemorie + " | " + frecventa + "MHz | " + latenta + " | " + voltaj + "V" + "  |  Pret: " + getPret() + " RON";
    } 
}