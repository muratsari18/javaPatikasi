import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Random rnd = new Random(); // random sayı oluşturmak için nesne oluşturduk
        Scanner scan = new Scanner(System.in);
        int number = rnd.nextInt(100); // 0-100 arası random sayı atttık

        int hak=0;
        boolean isWrong = false;
        boolean isWin = false;
        int [] tahmin = new int[5];
        while(hak<5){
            System.out.print("Lütfen tahmininizi giriniz:");
            int n= scan.nextInt();

            if (n<0 || n>99){
                System.out.println("0 -100 arasında değerler giriniz...");

                if (isWrong){ //True ise aşağıdakileri yapar başta false default olarak atandı.
                    hak++;
                    System.out.println("Çok fazla hatalı giriş yaptınız kalan hakkınız : " + (5 - hak));
                }
                else{
                    isWrong=true;
                    System.out.println("Bir adet hatalı girme hakkınız kaldı sonrakilerde hakkınızdan düşecektir...");}
                continue;
        }

            if (n==number){
                isWin=true;
                System.out.println("Tebrikler doğru tahmin ettiniz.");
                break;}
          
            else{

                if (n<number)
                    System.out.println("Daha büyük bir değer giriniz:");
                else
                    System.out.println("Daha küçük bir değer giriniz:");

            }
            tahmin[hak++]=n; // Arraya girdiğimiz sayıları atadık
            System.out.println("Kalan hakkın : " + (5- hak));

        }
    if (!isWin){
        System.out.println("Kaybettiniz !!!");
        if (!isWrong){
            System.out.println("Tahminleriniz :" + Arrays.toString(tahmin));
            System.out.println("Bulmaya çalıştığınız sayı : " + number);

        }
    }
  }
}
