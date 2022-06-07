import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int [] list = {15,12,788,1,-1,-778,2,0};

        int [] maxArr= new int[list.length]; //Büyük ve küçük sayıları tutmak için Array oluşturduk
        int [] minArr= new int[list.length];

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :"); // Kullaınıcıdan sayı aldık
        int number = scan.nextInt();
        int a = 0; int b=0; // Oluşan Arraylarin elemanlarını atamak için oluşturduk. For döngüsünde arttırıp her indexe bir 
        // eleman atayacağız.


        for (int i = 0; i< list.length; i++){
            if (list[i]>number){       //Arraydaki girilen sayıdan büyük olanları arraya attık
                maxArr[b]=list[i];
                b++;
            }
            if (list[i]<number){  // küçükleri arraya attık
                minArr[a]=list[i];
                a++;
            }


            }

        int max = maxArr[0]; //Oluşan arrayda ilk elemanı max a
        int min=minArr[0];   //Oluşan Arayda ilk olanı min e atadık.

        for (int i : maxArr)
        {
            if (i< max && i>number){ 
                //MAX arrayindeki tüm elemanları teker teker geziyoruz. Eğer i indexsindeki
                //değer ilk değerden küçük ve girdiğimiz sayıdan büyükse max a atıyoruz.
                //Böylece en küçük büyük değeri buluyoruz.
                max=i;
            }

        }
        for (int i: minArr) {
            if (i>min && i<number){    // Aynı işlem yapılıyor.
                min=i;
            }


            }
        System.out.println(min + " en yakın küçük değer");
        System.out.println(max + " en yakın büyük değer");

        }
    }
