package proiect.desktop;

public class PlacaDeSunet extends Componenta{
    int canaleAudio;
    int raportSemnal;
    Boolean suportDolbyAtmos;
    Boolean suportDTSX;

    PlacaDeSunet() {
    }

    PlacaDeSunet(String producator, int canaleAudio, int raportSemnal, Boolean suportDolbyAtmos, Boolean suportDTSX, double pret) {
        super(producator,pret);
        this.canaleAudio = canaleAudio;
        this.raportSemnal = raportSemnal;
        this.suportDolbyAtmos = suportDolbyAtmos;
        this.suportDTSX = suportDTSX;
    }

   PlacaDeSunet(PlacaDeSunet p){
       super(p);
        this.canaleAudio = p.canaleAudio;
        this.raportSemnal = p.raportSemnal;
        this.suportDolbyAtmos = p.suportDolbyAtmos;
        this.suportDTSX = p.suportDTSX;
   }

    public void setCanaleAudio(int canaleAudio) {
        this.canaleAudio = canaleAudio;
    }

    public void setRaportSemnal(int raportSemnal) {
        this.raportSemnal = raportSemnal;
    }

    public void setSuportDolbyAtmos(Boolean suportDolbyAtmos) {
        this.suportDolbyAtmos = suportDolbyAtmos;
    }

    public void setSuportDTSX(Boolean suportDTSX) {
        this.suportDTSX = suportDTSX;
    }

    public int getCanaleAudio() {
        return canaleAudio;
    }

    public int getRaportSemnal() {
        return raportSemnal;
    }

    public Boolean getSuportDolbyAtmos() {
        return suportDolbyAtmos;
    }

    public Boolean getSuportDTSX() {
        return suportDTSX;
    }

    @Override
    public String toString() {
        return getProducator() + " | " + canaleAudio +" canale | " + "Semnal " + raportSemnal + " | SuportDolbyAtmos " + suportDolbyAtmos + " | SuportDTSX " + suportDTSX + "  |  Pret: " + getPret() + " RON";
    }
}
