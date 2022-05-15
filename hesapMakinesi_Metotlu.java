import javax.swing.*;
import java.util.Scanner;
public class hesapMakinesiWithMethods {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        System.out.println(menu);


        while (true) {
            System.out.println("Yapmak istediğiniz işlemi seçiniz :");
            select = scan.nextInt();


            if (select==0)
                break;

            switch (select) {
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    diveded();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    modAlma();
                    break;
                case 8:
                    calcu();
                    break;
                default:
                    System.out.println("Geçersiz bir sayı girdiniz");
            }

        }

        System.out.println("Güle Güle !");
        }

    static void sum(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz :");
        int a = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        int b = scan.nextInt();

        int result = a + b;
        System.out.println("Sayıların toplamı :" + result);
    }
    static void minus(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz :");
        int a = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        int b = scan.nextInt();
        int result = a -b;
        System.out.println("Sayıların farkı :" + result);
    }
    static void times (){
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz :");
        int a = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        int b = scan.nextInt();
        int result = a*b;
        System.out.println(result);
    }
    static void diveded (){
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz :");
        int a = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        int b = scan.nextInt();
       int result=1;
        if ((a==0))
            System.out.println(result);
       else if (b==0){
            System.out.println("2. sayınız 0 olamaz.");

        }
        else {
             result = a/b;
            System.out.println("Sayıların bölümü : " + result);
        }
    }

    static void power( ){
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz :");
        int a = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        int b = scan.nextInt();
        int result =1;
        for(int i=1; i<=b; i++){
            result*=a;
        }
        System.out.println("Sayıların üstü :" + result);
    }
    static void faktoriyel(){
        Scanner scan = new Scanner(System.in);
        int a,result=1;
        System.out.print("Faktöriyelini aınmasını istediğiniz sayıyı giriniz :");
        a=scan.nextInt();
        for (int i=1; i<=a; i++){
            result*=i;
        }
        System.out.println("Girdiğiniz sayının faktöriyeli :" + result);
    }
    static void modAlma(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz :");
        int a = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        int b = scan.nextInt();
        int result= a%b;
        System.out.println("Girdiğiniz sayının modu :" + result);
    }
    static void calcu(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz :");
        int a = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        int b = scan.nextInt();
        System.out.println("Girdiğiniz sayının alanı :" +(2*(a+b)));
        System.out.println("Girdiğiniz sayının çevresi :" + a*b);
    }

}
