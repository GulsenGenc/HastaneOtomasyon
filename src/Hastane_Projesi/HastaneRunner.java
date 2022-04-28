package Hastane_Projesi;


import static Hastane_Projesi.VeriBankası.unvanlar;

public class HastaneRunner {


    public static void main(String[] args) {

        String unvan = doktorUnvan("Baş ağrısı");
        String hastaDurum;

        Doktor doktor = new Doktor();
        doktor = doktorBul("Norolog");
        System.out.println(doktor);


    }

    public static String doktorUnvan(String actuelDurum) {
        return "yanlış unvan";
    }

    public static Doktor doktorBul(String unvan) {

        Doktor doktor = new Doktor();

        for (int i = 0; i <Doktor.unvanlar.length; i++) {



        }




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



