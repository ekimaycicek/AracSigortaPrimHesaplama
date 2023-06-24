import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task01 {

    /*

    Proje: Araç Sigorta Prim Hesaplama
           Araç tipleri: otomobil,kamyon,otobüs,motosiklet
                        - otobüs: 18-30 koltuk veya 31 ve üstü koltuk
           Tarife dönemi: Aralık 2022,Haziran 2022
           1.dönemi: Haziran 2022                   2.dönem: Aralık 2022
             otomobil: 2000                           otomobil: 2500
             kamyon: 3000                             kamyon: 3500
             otobüs: tip1: 4000 tip2: 5000            otobüs: tip1: 4500 tip2: 5500
             motosiklet: 1500                         motosiklet: 1750

         Hatalı girişte hesaplama başarısız uyarısı verip tekrar menü gösterilsin.

     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Map<String, Integer> tarifeDonem = new HashMap<>();
        tarifeDonem.put("Haziran 2022", 1);
        tarifeDonem.put("Aralık 2022", 2);

        Map<String, Integer> aracPrimleri = new HashMap<>();
        aracPrimleri.put("otomobil", 2000);
        aracPrimleri.put("kamyon", 3000);
        aracPrimleri.put("otobüstip1", 4000);
        aracPrimleri.put("otobüstip2", 5000);
        aracPrimleri.put("motosiklet", 1500);

        System.out.println("Arac Sigorta Prim Hesaplama");
        System.out.println("Arac Türleri: otomobil, kamyon, otobüs (tip1, tip2), motosiklet");
        System.out.println("Tarife Dönemleri: Haziran 2022, Aralık 2022");



        boolean secim = false;
        String secilenArac = "";
        String secilenDonem = "";

        while (!secim) {
            System.out.print("Arac Türünü giriniz: ");
            secilenArac = input.nextLine();

            if (aracPrimleri.containsKey(secilenArac)) {
                secim = true;
            } else {
                System.out.println("Gecersiz arac türü. Lütfen tekrar deneyin.");
            }
        }



        secim = false;

        while (!secim) {
            System.out.print("Tarife Dönemi giriniz: ");
            secilenDonem = input.nextLine();

            if (tarifeDonem.containsKey(secilenDonem)) {
                secim = true;
            } else {
                System.out.println("Gecersiz tarife dönemi. Lütfen tekrar deneyiniz.");
            }
        }

        int prim = aracPrimleri.get(secilenArac);
        int donem = tarifeDonem.get(secilenDonem);

        if (donem==2) {
            prim+= 500;
        }

        System.out.println("Arac Sigorta Priminiz: " + prim);



    }
}




