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
