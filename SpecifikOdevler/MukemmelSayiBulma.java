
import java.util.Scanner;

public class MukemmelSayiBulma {

    public static void main(String[] args) {
    
      //** Girdi alabilmek için gerekli sınıfı çağırdık**\\
      Scanner scanner = new Scanner(System.in);
      int total = 0,input;
      System.out.print("Bir sayı giriniz: ->");
      input = scanner.nextInt();
      
      //** Burada eğer sayımız bir ve birden küçük ise mükemmel sayı değildir kontrolünü ve birden büyük ise mükemmel sayı olup olmadığını kontrol edecek**\\
      if(input <= 1) {
    	  System.out.println(input +" Mükemmel sayı değildir");
      }else {
        //** Döngü ile girdiğimiz sayıyı, 1 den sayının değerine kadar tam bölen pozitif tam sayıları buluyoruz ve bulduğumuz bu değerleri topluyoruz**\\
    	  for(int i = 1;i<input;i++) {
        	  if(input % i == 0) {
        		  total += i;
        	  }
          }
    	  
          //** Pozitif tam bölen sayıların toplamı, girilen sayıyı tam bölüyor ile mükemmel sayı, bölmüyorsa mükemmel sayı değil**\\
    	  if(input % total == 0) {
        	  System.out.println(input + " Mükemmel sayıdır");
          }else {
        	  System.out.println(input+ " Mükemmel ssatı değildir");
          }
          
        
      }
      
      
    }
}