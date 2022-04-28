package Hastane_Projesi;


public class HastaneRunner {

    public static void main(String[] args) {
        String hastaDurumu = "Bas agrisi";
        String unvan = doktorUnvan(hastaDurumu);

        obj.setDoktor(doktorBul(unvan));
        System.out.println("Doktor ismi: " + obj.getDoktor().getIsim());
        System.out.println("Doktor soy isim: " + obj.getDoktor().getSoyIsim());
        System.out.println("Doktor unvani: " + obj.getDoktor().getUnvan());
        obj.setHasta(hastaBul(hastaDurumu));
        System.out.println("Hasta ismi: " + obj.getHasta().getIsim());
        System.out.println("Hasta soyisim: " + obj.getHasta().getSoyIsim());
        System.out.println("hasta hasta ID: " + obj.getHasta().getHastaID());
        System.out.println(hastaDurumuBul(hastaDurumu));
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
           Doktor doktorObj = new Doktor();
        for (int i = 0; i <doktorObj.unvanlar.length; i++) {
            if (unvan.equals(doktorObj.unvanlar[i])) {
                doktorObj.setIsim(doktorObj.doctorIsimleri[i]);
                doktorObj.setSoyIsim(doktorObj.doctorSoyIsimleri[i]);
                doktorObj.setUnvan(unvan);



            }



        }














        return doktor;

        return doktorObj;

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


