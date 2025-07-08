import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Araba {

    static class araba {
        int id;
        String marka;
        String model;
        int yil;
        double fiyat;

        public araba(int id, String marka, String model, int yil, double fiyat) {
            this.id = id;
            this.marka = marka;
            this.model = model;
            this.yil = yil;
            this.fiyat = fiyat;
        }

        public String yazdir() {
            return "{\n" +
                    "  id = " + id + ",\n" +
                    "  marka = '" + marka + "',\n" +
                    "  model = '" + model + "',\n" +
                    "  yil = " + yil + ",\n" +
                    "  fiyat = " + fiyat + "\n" +
                    '}';

        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<araba> arabalar = new ArrayList<>();

        arabalar.add(new araba(1, "Mercedes", "CLA", 2025, 3500000));
        arabalar.add(new araba(2, "Citroen", "AMI", 2025, 450000));
        arabalar.add(new araba(3, "Honda", "Civic", 2025, 2500000));
        arabalar.add(new araba(4, "FIAT", "EGEA", 2025, 2000000));
        arabalar.add(new araba(5, "BMW", "320i", 2025, 5000000));

        int sec;
            System.out.println("\n=== Araba Galerisi ===");
            System.out.println("1. Tüm Arabaları Listele");
            System.out.println("2. Fiyata Göre Filtrele");
            System.out.println("3. Markaya Göre Filtrele");
            System.out.println("4. ÇIKIŞ");
            System.out.print("Seçiminizi girin: ");
            sec = scanner.nextInt();

        if (sec == 1) {
            for (araba Araba : arabalar) {
                System.out.println(Araba.yazdir());
            }
            } else if (sec == 2) {
                System.out.print("Maksimum fiyatı girin: ");
                double maxFiyat = scanner.nextDouble();
                for (araba Araba : arabalar) {
                    if (Araba.fiyat <= maxFiyat) {
                        System.out.println(Araba);
                    }
                }
            } else if (sec == 3) {
                System.out.print("Aranan marka: ");
                String markaAra = scanner.nextLine();
                for (araba Araba : arabalar) {
                    if (Araba.marka.contains(markaAra)) {
                        System.out.println(Araba);
                    }
                }
            }
        System.out.println("Programdan çıkılıyor...");
    }
}
