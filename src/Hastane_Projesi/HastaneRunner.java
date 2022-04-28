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
        Hastane obj=new Hastane();
        if(actuelDurum.equals("Allerji")){
            return obj.unvanlar[0];
        } else if(actuelDurum.equals("Bas agrisi")){
            return obj.unvanlar[1];
        }else if(actuelDurum.equals("Diabet")){
            return obj.unvanlar[2];
        }else if(actuelDurum.equals("Soguk alginligi")){
            return obj.unvanlar[3];
        }else if(actuelDurum.equals("Migren")){
            return obj.unvanlar[4];
        }else if(actuelDurum.equals("Kalp hastaliklari")){
            return obj.unvanlar[5];
        }

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


