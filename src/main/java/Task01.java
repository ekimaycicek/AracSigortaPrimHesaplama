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

        Map<String, Integer> tariffPeriod = new HashMap<>();
        tariffPeriod.put("June 2022", 1);
        tariffPeriod.put("December 2022", 2);

        Map<String, Integer> carPremiums = new HashMap<>();
        carPremiums.put("car", 2000);
        carPremiums.put("truck", 3000);
        carPremiums.put("bus 18-30", 4000);
        carPremiums.put("bus 31+", 5000);
        carPremiums.put("motorcycle", 1500);

        System.out.println("Vehicle Insurance Premium Calculation");
        System.out.println("Vehicle Types: automobile, truck, bus (18-30 seats, 31 and up seats), motorcycle");
        System.out.println("Tariff Periods: June 2022, December 2022");



        boolean vote = false;
        String selectedVehicle = "";
        String selectedPeriod = "";

        while (!vote) {
            System.out.print("Arac Türünü giriniz: ");
            selectedVehicle = input.nextLine();

            if (carPremiums.containsKey(selectedVehicle)) {
                vote = true;
            } else {
                System.out.println("Invalid vehicle type. Please try again.");
            }
        }



        vote = false;

        while (!vote) {
            System.out.print("Enter Tariff Period: ");
            selectedPeriod = input.nextLine();

            if (tariffPeriod.containsKey(selectedPeriod)) {
                vote = true;
            } else {
                System.out.println("Invalid tariff period. Please try again.");
            }
        }

        int premium = carPremiums.get(selectedVehicle);
        int period = tariffPeriod.get(selectedPeriod);

        if (period==2) {
            premium+= 500;
        }

        System.out.println("Your Car Insurance Premium: " + premium);



    }
}




