import java.util.Scanner;
public class recursiveMethodUsluSayi {
    
    static int result=1;  // dışarıda ve static yaptık yoksa görmüyordu. Main içinde
    
    static int power (int base, int exp){
      
      if (exp==0)
          return 1;
      result*=base;   //1 ile taban sayısı çarpılıyor result'a atanıyor ve result tekrar tabanla çarpılıyor
                      // Taki exp-1 den exp miz o olana kadar o zaman return 1 oluyor. ve Recursive Metotdan çıkıyoruz.

      power(base,exp-1);

        return result; // Ssonuç en son return result ile main e dönüyor.
        
        // Normalde dönme işlemi For ile yapıyorduk ama Recursive ile buna gerek kalmadı.

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz :");
        int base = scan.nextInt();
        System.out.print("Tavan Değerini Giriniz :");
        int exp = scan.nextInt();
        System.out.println(power(base,exp));
    }
}
