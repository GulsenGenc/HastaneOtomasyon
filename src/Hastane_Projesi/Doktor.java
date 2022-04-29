package Hastane_Projesi;

public class Doktor extends VeriBankası {
    private String isim;
    private String soyIsim;
    private String unvan;

    public Doktor() {
    }

    @Override
    public String toString() {
        return "Doktor{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", unvan='" + unvan + '\'' +
                "} " + super.toString();
    }

    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String getSoyIsim() {
        return soyIsim;
    }
    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }
    public String getUnvan() {
        return unvan;
    }
    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }



}
