
import java.util.Scanner;

public class MaxMinBulma {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int loop , input;
      
      //** Burada iki sayı karşılanacağı için, giriş için iki adet ve üstü sayı belirtmediği sürece uyarı verecek*\\
      do {
    	   System.out.print("Kaç sayı gireceksiniz: -> ");
    	   input = scanner.nextInt();
    	   if(input < 2) {
    		   System.out.print("İki sayı karşılaştırmak için, en az iki sayı giriniz!\n");
    	   }
   	} while (input < 2);
      
      //** Girilen elemanları korumak için dizi tanımladık**\\
      int[] dizi = new int[input];

      //** for döngüsü ile girilen her eleman diziye kayıt oldu**\\
      for(loop = 0; loop<dizi.length;loop++) {
    	  System.out.print(loop+1 +". Sayınızı giriniz: ");
    	  dizi[loop] = scanner.nextInt();
      }
      
      //** max için diziden rastgele bir değer atatım. Döngü ile tüm elemanları karşılaştırıp büyük olanı max a atadım**\\
      int max = dizi[0];
      for(loop = 0;loop<dizi.length;loop++) {
    	  if(max < dizi[loop]) {
    		  max = dizi[loop];
    	  }
      }
      
      //** min için diziden rastgele bir değer atatım. Döngü ile tüm elemanları karşılaştırıp küçük olanı min e atatım**\\
      int min = dizi[0];
      for(loop = 0;loop<dizi.length;loop++) {
    	  if(dizi[0] > dizi[loop]) {
    		  min = dizi[loop];
    	  }
      }

      //** Max ve mini bulduktan sonra yazdırdık**\\
      System.out.println("\nEn büyük sayınız: "+max);
      System.out.println("En küçük sayınız: "+min);
      
      
      
      
      
      
    }
    
}