import java.util.Scanner;

public class VucutKitleIndexHesaplayici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        double height = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        double weight = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Vücut Kitle İndeksiniz: " + bmi);
    }
}