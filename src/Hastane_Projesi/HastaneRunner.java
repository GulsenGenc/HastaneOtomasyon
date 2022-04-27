package Hastane_Projesi;



public class HastaneRunner {
    public static void main(String[] args) {

        String unvan = doktorUnvan("Baş ağrısı");
        String hastaDurum;

        Doktor doktor = new Doktor();
        doktor = doktorBul("Allergist");
        System.out.println(doktor);


    }

    public static String doktorUnvan(String actuelDurum) {
        return "yanlış unvan";
    }

    public static Doktor doktorBul(String unvan) {
        Doktor doktor = new Doktor();

        return doktor;
    }

    public static Durum hastaDurumuBul(String actuelDurum) {
        Durum hastaDurumu = new Durum();

        return hastaDurumu;
    }

    public static Hasta hastaBul(String actuelCase) {
        Hasta hasta = new Hasta();

        return hasta;
    }
}


