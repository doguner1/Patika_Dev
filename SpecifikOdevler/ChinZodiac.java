import java.util.Scanner;

public class ChinZodiac {
   public static void main(String[] args) {
    
       //** Burada kullanıcı girdi almamıza yardımcı olan sınıfı çağırdık**\\
	   Scanner scanner = new Scanner(System.in);
	   System.out.print("Lütfen doğum yılınızı **** şeklinde giriniz: ");

       //** Kullanıcın girdiği değeri birthYear  içine atadık**\\
	   int birthYear  = scanner.nextInt();
	   //** Girilen yılın mod 12 sini alarak kalan değerini bulduk**\\
	   int remainder = birthYear  % 12;
	   

       //** Burada switch case kullanımı yaptık. Switch kullanımı öpğrenmek isteyenler için yeterli not**\\
       //** Kalan değeri denk gelen case bloğu çalışacak ve break komutu ile işlem sonlanacak **\\
	   switch(remainder) {
	   		case 0:
	   			System.out.println("Çin Zodyağı burcunuz: Maymun");
	   			break;
	   		case 1:
	   			System.out.println("Çin Zodyağı burcunuz: Horoz");
	   			break;
	   		case 2:
	   			System.out.println("Çin Zodyağı burcunuz: Köpek");
	   			break;
	   		case 3:
	   			System.out.println("Çin Zodyağı burcunuz: Domuz");
	   			break;
	   		case 4:
	   			System.out.println("Çin Zodyağı burcunuz: Fare");
	   			break;
	   		case 5:
	   			System.out.println("Çin Zodyağı burcunuz: Öküz");
	   			break;
	   		case 6:
	   			System.out.println("Çin Zodyağı burcunuz: Kaplan");
	   			break;
	   		case 7:
	   			System.out.println("Çin Zodyağı burcunuz: Tavşan");
	   			break;
	   		case 8:
	   			System.out.println("Çin Zodyağı burcunuz: Ejderha");
	   			break;
	   		case 9:
	   			System.out.println("Çin Zodyağı burcunuz: Yılan");
	   			break;
	   		case 10:
	   			System.out.println("Çin Zodyağı burcunuz: At");
	   			break;
	   		case 11:
	   			System.out.println("Çin Zodyağı burcunuz: Koyun");
	   			break;
	   }
	   
   }
}