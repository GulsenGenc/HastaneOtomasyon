package Hastane_Projesi;

import java.util.Arrays;

public class HastaneRunner {
    public static void main(String[] args) {


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
                System.out.println("geçerli bir durum değildir");
        }


        return hastaDurumu;
    }

    public static Hasta hastaBul(String actuelCase) {
        Hasta hasta = new Hasta();

        return hasta;
    }
}


