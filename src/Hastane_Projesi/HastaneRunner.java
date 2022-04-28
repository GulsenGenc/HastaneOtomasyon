package Hastane_Projesi;



public class HastaneRunner {
    private static Hastane obj=new Hastane();
    public static void main(String[] args) {



    }

    public static String doktorUnvan(String actuelDurum) {
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
        for (int i = 0; i <Hastane.unvanlar.length; i++) {


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
                System.out.println("geçerli bir durum değildir");
        }


        return hastaDurumu;
    }

    public static Hasta hastaBul(String actuelCase) {
        Hasta hasta = new Hasta();

        return hasta;
    }
}


