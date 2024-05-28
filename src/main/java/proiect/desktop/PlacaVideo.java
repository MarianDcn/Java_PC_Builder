package proiect.desktop;

public class PlacaVideo extends Componenta {
    String serieProcesor;
    int vRAM;
    String slot;
    String rezolutieMaxima;

    PlacaVideo() {
    }

    PlacaVideo(String producator, String serieProcesor,int vRAM, String slot, String rezolutieMaxima, double pret) {
        super(producator,pret);
        this.serieProcesor = serieProcesor;
        this.vRAM = vRAM;
        this.slot = slot;
        this.rezolutieMaxima = rezolutieMaxima;
    }
    
    PlacaVideo(PlacaVideo p){
        super(p);
        this.serieProcesor=p.serieProcesor;
        this.vRAM=p.vRAM;
        this.slot=p.slot;
        this.rezolutieMaxima=p.rezolutieMaxima;
    }
    
    public String getSerieProcesor() {
        return serieProcesor;
    }
    public void setSerieProcesor(String serieProcesor) {
        this.serieProcesor = serieProcesor;
    }
    
    public int getVram() {
        return vRAM;
    }
    public void setVram(int vRAM) {
        this.vRAM = vRAM;
    }
    
    public String getSlot() {
        return slot;
    }
    public void setSlot(String slot) {
        this.slot = slot;
    }
    
    public String getRezolutieMaxima() {
        return rezolutieMaxima;
    }
    
    public void setRezolutieMaxima(String rezolutieMaxima){
        this.rezolutieMaxima = rezolutieMaxima;
    }

    @Override
    public String toString() {
        return getProducator() + " | " + serieProcesor + " | " + vRAM + "GB | " + slot + " | Rezolutie: " + rezolutieMaxima + "  |  Pret: " + getPret() + " RON";
    }
}
