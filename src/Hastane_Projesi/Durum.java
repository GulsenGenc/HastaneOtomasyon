package Hastane_Projesi;

public class Durum {
    private String actuelDurum;
    private boolean aciliyet;

    public Durum() {
    }

    public String getActuelDurum() {
        return actuelDurum;
    }

    public void setActuelDurum(String actuelDurum) {
        this.actuelDurum = actuelDurum;
    }

    public boolean isAciliyet() {
        return aciliyet;
    }

    public void setAciliyet(boolean aciliyet) {
        this.aciliyet = aciliyet;
    }
}