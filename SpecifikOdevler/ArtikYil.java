import java.util.Scanner;

public class ArtikYil {
   public static void main(String[] args) {

       //** Kullanıcıdan girdi alabilmek için gerekli sınıfımız çağırdık**\\
	   Scanner scanner = new Scanner(System.in);
	   System.out.print("Yıl giriniz: ");
	   int years = scanner.nextInt();
	   
       //** 
       //   Yıl 4 e bölümünde kalan sıfır ise 
       //   veya
       //   100 ün katı ve 400 ün katı ise artık yıldır
       //** 
       
	   if(years % 4 == 0 || years % 100 == 0 && years % 400 == 0) {
		   System.out.println(years + " bir artık yıldır");
		   
	   }else {
		   System.out.println(years + " bir artık yıl değildir");
	   }
	   
	   
   }
}