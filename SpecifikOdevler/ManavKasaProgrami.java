import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        
        //**Etilet Fiyatımızı yazıyoruz**\\
        double pearPrice = 2.14;
        double applePrice = 3.67;
        double tomatoPrice = 1.11;
        double bananaPrice = 0.95;
        double eggplantPrice = 5.00;
        
        
        //**Kullanıcı girdisi alabilmek için gerekli sınıfımı çağırıyoruz**\\
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Armut Kaç Kilo ? :");
        double pearWeight = scanner.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        double appleWeight = scanner.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        double tomatoWeight = scanner.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        double bananaWeight = scanner.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        double eggplantWeight = scanner.nextDouble();
        
        
        //**Girilen kullanıcı değerlerine göre etiket fiyatımızla çarpıp topluyoruz**\\
        double totalPrice = pearWeight * pearPrice +
                             appleWeight * applePrice +
                             tomatoWeight * tomatoPrice +
                             bananaWeight * bananaPrice +
                             eggplantWeight * eggplantPrice;
        
        //**Toplam masrafımız TL cinsinden çıktısını alıyoruz**\\
        System.out.println("Toplam Tutar : " + totalPrice + " TL");
    }
}