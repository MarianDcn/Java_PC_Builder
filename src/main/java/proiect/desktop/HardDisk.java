package proiect.desktop;

import java.io.Serializable;

    public class HardDisk extends Componenta  
    {
    int capacitate;
    int viteza;
    int buffer;
    String interfata;
    double format;

    HardDisk()
{    
}
   
    HardDisk(String producator, int capacitate, int viteza, int buffer, String interfata, double format, double pret) 
 {  super(producator, pret);
    this.capacitate = capacitate;
    this.viteza = viteza;
    this.buffer = buffer;
    this.interfata = interfata;
    this.format = format;   
  }
 
    HardDisk(HardDisk a) {
        super(a);
        this.capacitate = a.capacitate;
        this.viteza = a.viteza;
        this.buffer = a.buffer;
        this.interfata = a.interfata;
        this.format = a.format;     
}

    public int getCapacitate() {
        return capacitate;
    }

    public int getViteza() {
        return viteza;
    }

    public int getBuffer() {
        return buffer;
    }

    public String getInterfata() {
        return interfata;
    }

    public double getFormat() {
        return format;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public void setViteza(int viteza) {
        this.viteza = viteza;
    }

    public void setBuffer(int buffer) {
        this.buffer = buffer;
    }

    public void setInterfata(String interfata) {
        this.interfata = interfata;
    }

    public void setFormat(double format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return getProducator() + " | " + capacitate + "GB | " + viteza + "rpm | " + buffer + "MB | " + interfata + " | " + format + "  |  Pret: " + getPret() +" RON";
    }
}