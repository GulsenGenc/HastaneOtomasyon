package Hastane_Projesi;

import java.util.Arrays;

public class HastaneRunner {
    public static void main(String[] args) {

        String unvan = doktorUnvan("Baş ağrısı");
        String hastaDurum;

        Doktor doktor = new Doktor();
        doktor = doktorBul("Allergist");
        System.out.println(doktor);


    }

    public static String doktorUnvan(String actuelDurum) {
        switch (actuelDurum) {
            case "Allerji":
                return "Allergist";
            case "Baş ağrısı":
                return "Norolog";
            case "Diabet":
                return "Genel Cerrah";
            case "Soğuk algınlığı":
                return "Çocuk Doktoru";
            case "Migren":
                return "Dahiliye";
            case "Kalp Hastalıkları":
                return "Kardiolog";
            default:
                return "Yanlış Unvan";
        }
    }

    public static Doktor doktorBul(String unvan) {
        Doktor doktor = new Doktor();

        switch (unvan) {
            case "Allergist":
                doktor.setIsim(doktor.doctorIsimleri[0]);
                doktor.setSoyIsim(doktor.doctorSoyIsimleri[0]);
                doktor.setUnvan("Allergist");
                break;
            case "Norolog":
                doktor.setIsim(doktor.doctorIsimleri[1]);
                doktor.setSoyIsim(doktor.doctorSoyIsimleri[1]);
                doktor.setUnvan("Norolog");
                break;
            case "Genel cerrah":
                doktor.setIsim(doktor.doctorIsimleri[2]);
                doktor.setSoyIsim(doktor.doctorSoyIsimleri[2]);
                doktor.setUnvan("Genel cerrah");
                break;
            case "Cocuk doktoru":
                doktor.setIsim(doktor.doctorIsimleri[3]);
                doktor.setSoyIsim(doktor.doctorSoyIsimleri[3]);
                doktor.setUnvan("Cocuk doktoru");
                break;
            case "Dahiliye":
                doktor.setIsim(doktor.doctorIsimleri[4]);
                doktor.setSoyIsim(doktor.doctorSoyIsimleri[4]);
                doktor.setUnvan("Dahiliye");
                break;
            case "Kardiolog":
                doktor.setIsim(doktor.doctorIsimleri[5]);
                doktor.setSoyIsim(doktor.doctorSoyIsimleri[5]);
                doktor.setUnvan("Kardiolog");
                break;
        }


        return doktor;
    }

    public static Durum hastaDurumuBul(String actuelDurum) {
        Durum hastaDurumu = new Durum();
        switch (actuelDurum) {
            case "Baş ağrısı":
                hastaDurumu.setAciliyet(false);
                break;
            case "Allerji":
                hastaDurumu.setAciliyet(false);
                break;
            case "Soğuk algınlığı":
                hastaDurumu.setAciliyet(false);
                break;
            case "Diabet":
                hastaDurumu.setAciliyet(false);
                break;
            case "Kalp hastalıkları":
                hastaDurumu.setAciliyet(true);
                break;
            case "Migren":
                hastaDurumu.setAciliyet(true);
                break;
            default:
                System.out.println("geçerl bir durum değildir");

        }
        return hastaDurumu;
    }

    public static Hasta hastaBul(String actuelCase) {
        Hasta hasta = new Hasta();
        for (int i = 0; i < hasta.hastaIDleri.length ; i++) {
            hasta.setIsim(hasta.hastaIsimleri[i]);

        }
        return hasta;
    }
}


