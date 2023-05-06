import java.util.Scanner;

public class UcakBiletiHesaplayici {
   public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int distance, age, travelType;
        double basePrice, ageDiscount, discountedPrice, roundTripDiscount, totalPrice;
        
        //** Mesafe bilgisi alınırken sadece pozitif değerleri kabul edilecek**\\
        //** Burada yanlış değer girilirse, istenilen değer girilene kadar dönecek**\\
        do {
            System.out.print("Enter distance in km: ");
            distance = input.nextInt();
            if (distance < 0) {
                System.out.println("Invalid input!");
            }
        } while (distance < 0);
        
        //** Yaş bilgisi alınırken sadece pozitif değerler kabul edilecek**\\
        //** Burada yanlış değer girilirse, istenilen değer girilene kadar dönecek**\\
        do {
            System.out.print("Enter your age: ");
            age = input.nextInt();
            if (age < 0) {
                System.out.println("Invalid input!");
            }
        } while (age < 0);
        
        //** Yolculuk tiği bilgisi alınırken 1 veya 2 değerler kabul edilecek**\\
        //** Burada yanlış değer girilirse, istenilen değer girilene kadar dönecek**\\
        do {
            System.out.print("Enter travel type (1 for one-way, 2 for round-trip): ");
            travelType = input.nextInt();
            if (travelType != 1 && travelType != 2) {
                System.out.println("Invalid input!");
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
        
        System.out.println("Total price = " + totalPrice + " TL");
    }
}