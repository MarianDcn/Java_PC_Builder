package proiect.desktop;

public class PlacaDeBaza extends Componenta{
    String socket;
    String chipset;
    String tipMemorie;
    int capacitateMemorie;
    int rataTransfer;
    int porturiUSB;
    
    PlacaDeBaza(){
    }
    
    PlacaDeBaza(String producator,String socket,String chipset,String tipMemorie,int capacitateMemorie,int rataTransfer,int porturiUSB,double pret){
        super(producator,pret);
    this.socket=socket;
    this.chipset=chipset;
    this.tipMemorie=tipMemorie;
    this.capacitateMemorie=capacitateMemorie;
    this.rataTransfer=rataTransfer;
    this.porturiUSB=porturiUSB;
}
    
    PlacaDeBaza(PlacaDeBaza p){
        super(p);
        this.socket=p.socket;
        this.chipset=p.chipset;
        this.tipMemorie=p.tipMemorie;
        this.capacitateMemorie=p.capacitateMemorie;
        this.rataTransfer=p.rataTransfer;
        this.porturiUSB=p.porturiUSB;
    }
    
    public void setSocket(String socket){
    this.socket=socket;
    }
    public void setChipset(String chipset){
    this.chipset=chipset;
    }
    public void setTipMemorie(String tipMemorie){
    this.tipMemorie=tipMemorie;
    }
    public void setCapacitateMemorie(int capacitateMemorie){
        this.capacitateMemorie=capacitateMemorie;
    }
    public void setRataTransfer(int rataTransfer){
        this.rataTransfer=rataTransfer;
    }
    public void setPorturiUSB(int porturiUSB){
        this.porturiUSB=porturiUSB;
    }

     public String getSocket(){
        return this.socket;
    }
    public String getChipset(){
        return this.chipset;
    }
    public String getTipMemorie(){
        return this.tipMemorie;
    }
     public int getCapacitateMemorie(){
        return this.capacitateMemorie;
    }
    public int getRataTransfer(){
        return this.rataTransfer;
    }
     public int getPorturiUSB(){
        return this.porturiUSB;
    }

    @Override
    public String toString() {
        return getProducator() + " | " + socket + " | " + chipset + " | " + tipMemorie + " | " + capacitateMemorie + " Transfer: " + rataTransfer + " MB/s | " + porturiUSB + " porturi" + "  |  Pret: " + getPret() + " RON";
    }
}
