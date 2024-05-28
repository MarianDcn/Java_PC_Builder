package proiect.desktop;

public class Carcasa extends Componenta
{
    String tipCarcasa;
    String dimensiuni;
    String culoare;
    int nrTotalVentilatoare;
    int nrVentilatoareIncluse;
    float greutate;
    
    Carcasa()
    { 
    }
    
    
    Carcasa(String producator, String tipCarcasa, String dimensiuni, String culoare, int nrTotalVentilatoare, int nrVentilatoareIncluse, float greutate,double pret)
    { 
        super(producator,pret);
    this.tipCarcasa=tipCarcasa;
    this.dimensiuni=dimensiuni;
    this.culoare=culoare;
    this.nrTotalVentilatoare=nrTotalVentilatoare;
    this.nrVentilatoareIncluse=nrVentilatoareIncluse;
    this.greutate=greutate;
    }
    
    Carcasa(Carcasa a)
    {
        super(a);
    this.tipCarcasa=a.tipCarcasa;
    this.dimensiuni=a.dimensiuni;
    this.culoare=a.culoare;
    this.nrTotalVentilatoare=a.nrTotalVentilatoare;
    this.nrVentilatoareIncluse=a.nrVentilatoareIncluse;
    this.greutate=a.greutate;
    }

    public void setTipCarcasa(String tipCarcasa) {
        this.tipCarcasa = tipCarcasa;
    }

    public void setDimensiuni(String dimensiuni) {
        this.dimensiuni = dimensiuni;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setNrTotalVentilatoare(int nrTotalVentilatoare) {
        this.nrTotalVentilatoare = nrTotalVentilatoare;
    }

    public void setNrVentilatoareIncluse(int nrVentilatoareIncluse) {
        this.nrVentilatoareIncluse = nrVentilatoareIncluse;
    }

    public void setGreutate(float greutate) {
        this.greutate = greutate;
    }

    public String getTipCarcasa() {
        return tipCarcasa;
    }

    public String getDimensiuni() {
        return dimensiuni;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getNrTotalVentilatoare() {
        return nrTotalVentilatoare;
    }

    public int getNrVentilatoareIncluse() {
        return nrVentilatoareIncluse;
    }

    public float getGreutate() {
        return greutate;
    }
    @Override
    public String toString() {
        return getProducator() + " | " + tipCarcasa + " | " + dimensiuni + " | " + culoare + " | " + nrTotalVentilatoare + " ventilatoare " + "dintre care " + nrVentilatoareIncluse + " incluse " +" | " + greutate + "kg" + "  |  Pret: " + getPret() + " RON";
    }

 
}
