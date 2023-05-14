public class AsalSayilar {
    public static void main(String[] args) {
        int i, j;
        boolean asal;
        
        //** Kullanıcı bilgi metni**\\
        System.out.println("1-100 arasindaki asal sayilar: ");
        
        //** 1 zaten asıl sayı olmadığından 2 den 100e kadar olan asıl kontrolü yapacağız**\\
        for(i=2; i<=100; i++) {
            asal = true;
            //** Kontrole düşen sayı Asal olup olmadığını kontrol ediyoruz**\\
            for(j=2; j<i; j++) {
                //** Asal değil ise döngü burada son bulup diğer sayıya geçiyor**\\
                if(i%j == 0) {
                    asal = false;
                    break;
                }
            }
            //** Asal ise yazdırıyoruz**\\
            if(asal) {
                System.out.print(i + " ");
            }
        }
    }
}
