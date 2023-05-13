import java.util.Scanner;

public class UcakBiletHesaplayici {
   public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int distance, age, travelType;
        double basePrice, ageDiscount, discountedPrice, roundTripDiscount, totalPrice;
        
        //** Mesafe bilgisi alınırken sadece pozitif değerleri kabul edilecek**\\
        //** Burada yanlış değer girilirse, istenilen değer girilene kadar dönecek**\\
        do {
            System.out.print("Mesafeyi km türünden giriniz : ");
            distance = input.nextInt();
            if (distance < 0) {
                System.out.println("Hatalı Veri Girdiniz !");
            }
        } while (distance < 0);
        
        //** Yaş bilgisi alınırken sadece pozitif değerler kabul edilecek**\\
        //** Burada yanlış değer girilirse, istenilen değer girilene kadar dönecek**\\
        do {
            System.out.print("Yaşınızı giriniz : ");
            age = input.nextInt();
            if (age < 0) {
                System.out.println("Hatalı Veri Girdiniz !");
            }
        } while (age < 0);
        
        //** Yolculuk tiği bilgisi alınırken 1 veya 2 değerler kabul edilecek**\\
        //** Burada yanlış değer girilirse, istenilen değer girilene kadar dönecek**\\
        do {
            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
            travelType = input.nextInt();
            if (travelType != 1 && travelType != 2) {
                System.out.println("Hatalı Veri Girdiniz !");
            }
        } while (travelType != 1 && travelType != 2);
        
        //** Normal tutar hesaplanıyor**\\
        basePrice = distance * 0.10;
        
        //** Yaş indirimi bu alan da hesaplanır**\\
        if (age < 12) {
            ageDiscount = basePrice * 0.50;
        } else if (age >= 12 && age <= 24) {
            ageDiscount = basePrice * 0.10;
        } else if (age >= 65) {
            ageDiscount = basePrice * 0.30;
        } else {
            ageDiscount = 0;
        }
        
        //** İndirim var ise indirim burada hesaplanıyor**\\
        discountedPrice = basePrice - ageDiscount;
        
        //** Yolculuk tipine göre indirim ayarlanıyor**\\
        if (travelType == 2) {
            roundTripDiscount = discountedPrice * 0.20;
        } else {
            roundTripDiscount = 0;
        }
        
        //** Toplam tutar hesaplanıyor**\\
        totalPrice = (discountedPrice - roundTripDiscount) * travelType;
        
        System.out.println("Toplam Tutar = " + totalPrice + " TL");
    }
}