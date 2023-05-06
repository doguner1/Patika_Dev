

import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan fiyatı al
        System.out.print("Lütfen fiyatı giriniz: ");
        double price = scanner.nextDouble();

        // Fiyata göre KDV oranını belirle
        double vatRate;
        if (price > 0 && price <= 1000) {
            vatRate = 0.18;
        } else {
            vatRate = 0.08;
        }

        // KDV tutarını ve KDV'li fiyatı hesapla
        double vatAmount = price * vatRate;
        double priceWithVat = price + vatAmount;

        // Sonuçları ekrana bastır
        System.out.println("KDV'siz fiyat: " + price);
        System.out.println("KDV oranı: %" + (vatRate * 100));
        System.out.println("KDV tutarı: " + vatAmount);
        System.out.println("KDV'li fiyat: " + priceWithVat);
    }
}
