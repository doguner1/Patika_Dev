import java.util.Scanner;

public class NotOrtalamasiHesapla {

    public static void main(String[] args) {

        //**Kullanıcıdan girdi alabilmemiz için gerekli Scanner sınıfı**
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu girin: ");
        double matematik = input.nextDouble();

        System.out.print("Fizik notunuzu girin: ");
        double fizik = input.nextDouble();

        System.out.print("Kimya notunuzu girin: ");
        double kimya = input.nextDouble();

        System.out.print("Türkçe notunuzu girin: ");
        double turkce = input.nextDouble();

        System.out.print("Tarih notunuzu girin: ");
        double tarih = input.nextDouble();

        System.out.print("Müzik notunuzu girin: ");
        double muzik = input.nextDouble();

        //**Tüm derslerin toplamanı ders sayısına bölerek ortalamayı alıyoruz**
        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

        //**if-else kullanmadan ortalamanın duruma göre sınıftan geçtiğimizi veya kaldığımızı ölçüyoruz**
        String durum = (ortalama >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        

        System.out.println("Ortalamanız: " + ortalama);
        System.out.println(durum);
    }
}
