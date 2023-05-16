import java.util.Scanner;

public class UcgenCizimi {
    public static void main(String[] args) {
        //** Kullanıcdan girdi almak için gereken sınıfı çağırdık**\\
        Scanner scanner = new Scanner(System.in);
        System.out.print("Üçgenin basamak sayısını girin: ");

        //** Üçgen Tabannını kullanıcıdan aldık**\\
        int basamak = scanner.nextInt();
        
        
        System.out.println("Sola Yatık Üçgen Modeli");
        for (int i = 1; i <= basamak; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("Sağa Yatık Üçgen Modeli");
        for (int i = 1; i <= basamak; i++) {
            for (int j = 1; j <= basamak - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("Ters Sağa Yatık Üçgen Modeli");
        for (int i = basamak; i >= 1; i--) {
            for (int j = 1; j <= basamak - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("Ters Sola Yatık Üçgen Modeli");
        for (int i = 1; i <= basamak; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= basamak; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
