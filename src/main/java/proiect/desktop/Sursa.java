package proiect.desktop;

public class Sursa extends Componenta{
    String format;
    int putere;

   Sursa(){
   } 

    Sursa(String producator, String format, int putere, double pret) {
        super(producator,pret);
        this.format = format;
        this.putere = putere;
    }
   
    Sursa(Sursa s){
        super(s);
        this.format = s.format;
        this.putere = s.putere;
   }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }

    public String getFormat() {
        return format;
    }

    public int getPutere() {
        return putere;
    }

    @Override
    public String toString() {
        return getProducator() + " | " + putere + "W | " + format + "  |  Pret: " + getPret() + " RON";
    }
}
