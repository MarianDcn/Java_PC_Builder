package proiect.desktop;

public class Procesor extends Componenta{
    int generatie;
    int serieGeneratie;
    String modelSerieGeneratie;
    float frecventa;
    int nrNuclee;
    int memorieCache;
    String socket;

Procesor(){
}

Procesor(String producator,int generatie,int serieGeneratie ,String modelSerieGeneratie ,float frecventa,int nrNuclee,int memorieCache,String socket,double pret){
    super(producator,pret);
    this.generatie=generatie;
    this.serieGeneratie=serieGeneratie;
    this.modelSerieGeneratie=modelSerieGeneratie;
    this.frecventa=frecventa;
    this.nrNuclee=nrNuclee;
    this.memorieCache=memorieCache;
    this.socket=socket;
}

Procesor(Procesor p){
    super(p);
    this.generatie=p.generatie;
    this.serieGeneratie=p.serieGeneratie;
    this.modelSerieGeneratie=p.modelSerieGeneratie;
    this.frecventa=p.frecventa;
    this.nrNuclee=p.nrNuclee;
    this.memorieCache=p.memorieCache;
    this.socket=p.socket;
}
   
public void setGeneratie(int generatie){
    this.generatie=generatie;
}

public void setFrecventa(float frecventa){
    this.frecventa=frecventa;
}

public void setNrNuclee(int nrNuclee){
    this.nrNuclee=nrNuclee;
}

public void setMemorieCache(int memorieCache){
    this.memorieCache=memorieCache;
}

public void setSocket(String socket){
    this.socket=socket;
}

    public int getGeneratie() {
        return generatie;
    }

    public float getFrecventa() {
        return frecventa;
    }

    public int getNrNuclee() {
        return nrNuclee;
    }

    public int getMemorieCache() {
        return memorieCache;
    }

    public String getSocket() {
        return socket;
    }

    public int getSerieGeneratie() {
        return serieGeneratie;
    }

    public String getModelSerieGeneratie() {
        return modelSerieGeneratie;
    }

    public void setSerieGeneratie(int serieGeneratie) {
        this.serieGeneratie = serieGeneratie;
    }

    public void setModelSerieGeneratie(String modelSerieGeneratie) {
        this.modelSerieGeneratie = modelSerieGeneratie;
    }

    
    
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        if(getProducator().equals("Intel")){
                str.append("Intel Core | i")
                .append(generatie).append("-").append(serieGeneratie).append(modelSerieGeneratie).append(" | ")
                .append(frecventa).append(" | ")
                .append(nrNuclee).append(" nuclee | ")
                .append(memorieCache).append("MB | ")
                .append("Socket ").append(socket)
                .append("   |   Pret: ").append(getPret()).append(" RON");
        }
                else if(getProducator().equals("AMD")){
                 str.append("AMD Ryzen | ")
                .append(generatie).append("-").append(serieGeneratie).append(modelSerieGeneratie).append(" | ")
                .append(frecventa).append(" | ")
                .append(nrNuclee).append(" nuclee | ")
                .append(memorieCache).append("MB | ")
                .append("Socket ").append(socket)
                .append("   |   Pret: ").append(getPret()).append(" RON");
                }
        return str.toString();
    }
}
