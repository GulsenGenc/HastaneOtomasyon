package Hastane_Projesi;

public class Hastane extends VeriBankası{

    private Doktor doktor;
    private Hasta hasta;

    public Hastane() {
    }

    public Doktor getDoktor() {
        return doktor;
    }
    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }
    public Hasta getHasta() {
        return hasta;
    }
    public void setHasta(Hasta hasta) {
        this.hasta = hasta;
    }

}
