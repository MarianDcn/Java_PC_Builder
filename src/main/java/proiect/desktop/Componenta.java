package proiect.desktop;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Componenta implements Serializable {
    String producator;
    double pret;
    
    Componenta(){
    }
    
    Componenta(String producator, double pret){
        this.producator=producator;
        this.pret=pret;
    }
    
    Componenta(Componenta c){
        this.producator=c.producator;
        this.pret=c.pret;
    }
    
    public void setProducator(String producator){
        this.producator=producator;
    }
    public void setPret(double pret){
        this.pret=pret;
    }
    
    public String getProducator(){
        return this.producator;
    }
    public double getPret(){
        return this.pret;
    }
   
    public String[] sortareVectorPlacaVideo(PlacaVideo[] vectorPlacaVideo){
         Set<String> setProducatorPlacaVideo = new HashSet<>();
        for(PlacaVideo placaVideo : vectorPlacaVideo){
            setProducatorPlacaVideo.add(placaVideo.getProducator());
        }
        String[] arrayProducatori = setProducatorPlacaVideo.toArray(new String[0]);     
        return arrayProducatori;
    }
    
    
    
    
    
    
    
    
    @Override
    public String toString() {
        return "Componenta{" + "producator=" + producator + ", pret=" + pret + '}';
    } 
}
