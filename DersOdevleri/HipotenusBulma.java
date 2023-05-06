import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //**Kullanıcıdan üç kenar uzunluğunu alma**\\
        System.out.print("1. Dik kenarın uzunluğunu giriniz: ");
        double a = input.nextDouble();

        System.out.print("2. Dik kenarın uzunluğunu giriniz: ");
        double b = input.nextDouble();


        //**Hipotenüs hesaplama**\\
        double hipotenus = Math.sqrt(a*a + b*b);
        // Hipotenüs yazdırma
        System.out.println("Üçgenin hipotenüsü: " + hipotenus);




        //**Yarı çevreyi hesaplama**\\
        double u = (a + b + hipotenus) / 2;

        // alanı hesaplama
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - hipotenus));
    }
}


public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    int distance, age, travelType;
    double basePrice, ageDiscount, discountedPrice, roundTripDiscount, totalPrice;
    
    // Only accept positive values for distance
    do {
        System.out.print("Enter distance in km: ");
        distance = input.nextInt();
        if (distance < 0) {
            System.out.println("Invalid input!");
        }
    } while (distance < 0);
    
    // Only accept positive values for age
    do {
        System.out.print("Enter your age: ");
        age = input.nextInt();
        if (age < 0) {
            System.out.println("Invalid input!");
        }
    } while (age < 0);
    
    // Only accept 1 or 2 for travel type
    do {
        System.out.print("Enter travel type (1 for one-way, 2 for round-trip): ");
        travelType = input.nextInt();
        if (travelType != 1 && travelType != 2) {
            System.out.println("Invalid input!");
        }
    } while (travelType != 1 && travelType != 2);
    
    // Calculate base price
    basePrice = distance * 0.10;
    
    // Calculate age discount
    if (age < 12) {
        ageDiscount = basePrice * 0.50;
    } else if (age >= 12 && age <= 24) {
        ageDiscount = basePrice * 0.10;
    } else if (age >= 65) {
        ageDiscount = basePrice * 0.30;
    } else {
        ageDiscount = 0;
    }
    
    // Calculate discounted price
    discountedPrice = basePrice - ageDiscount;
    
    // Calculate round-trip discount
    if (travelType == 2) {
        roundTripDiscount = discountedPrice * 0.20;
    } else {
        roundTripDiscount = 0;
    }
    
    // Calculate total price
    totalPrice = (discountedPrice - roundTripDiscount) * travelType;
    
    System.out.println("Total price = " + totalPrice + " TL");
}
