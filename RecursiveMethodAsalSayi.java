import java.util.Scanner;


    public class RecursiveAsalSayi {
        static int asalMi(int num, int i){ //sayıları aldık i==1 olursa mainde prime ==1 olur ve asal deriz.
            if (num==1)
                return 0;
            if (i==1)
                return 1;
            else
                if (num%i==0)  // Girdiğimiz sayının yarısına tam bölünürse asal değildir başka bölenleri vardır.
            return 0;
                else return asalMi(num,i-1); // i==1 DEĞİL VE TAM BÖLÜNMÜYORSA TEKRARA SOKUYORUZ.
        }



        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Asal olduğunu düşündüğün sayıyı gir :");
            int num = scan.nextInt();
            int prime = asalMi(num,num/2); // Metota değerleri girdik i değeri girdiğimiz sayının yarısı
            if (prime==1)
                System.out.println("Girdiğiniz sayı asal sayıdır :" + num);
            else
                System.out.println("girdiğiniz sayı asal sayı değildr : " +num);
        }
    }
