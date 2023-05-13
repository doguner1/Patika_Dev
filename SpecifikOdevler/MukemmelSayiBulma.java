
import java.util.Scanner;

public class MukemmelSayiBulma {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int total = 0,input;
      System.out.print("Bir sayı giriniz: ->");
      input = scanner.nextInt();
      
      if(input <= 1) {
    	  System.out.println(input +" Mükemmel sayı değildir");
      }else {
    	  for(int i = 1;i<input;i++) {
        	  if(input % i == 0) {
        		  total += i;
        	  }
          }
    	  
    	  if(input % total == 0) {
        	  System.out.println(input + " Mükemmel sayıdır");
          }else {
        	  System.out.println(input+ " Mükemmel ssatı değildir");
          }
          
        
      }
      
      
    }
}