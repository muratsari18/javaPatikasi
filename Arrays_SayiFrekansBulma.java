import java.util.Arrays;

public class SayiFrekans {
    public static void main(String[] args) {
        int[] dizi = {10, 2, 2, 12, 10, 56, 12, 23, 12, 23, 56,7};
        int[] dizi2 = {10, 2, 2, 12, 10, 56, 12, 23, 12, 23, 56,7};
        int[] frekans = new int[dizi.length];

        //Dizideki tüm elemanlar en az 1 adet var bu yüzden hepsinnin frekans sayısını 1 yazıyoruz.

        for (int i=0; i< dizi.length;i++){
            frekans[i]=1;
        }

        //Her indeksten dizimizde kaçtane olduğunu frekans dizimize yazıyoruz
        for (int i=0; i< dizi.length; i++){
            for (int j=0; j<dizi.length; j++){
                if (i!=j && dizi[i]==dizi[j])
                    frekans[i]++;
            }
 //          int[]dizi={10, 2, 2, 12, 10, 56, 12, 23, 12, 23, 56};
 //                    [2, 2, 2, 3, 2, 2, 3, 2, 3, 2, 2] tüm elemanların kaç adet olduğu yazılı

        }

        //Dizide aynı değerde başka sayılar varsa bunların değerlerini 0 yapıyoruz Ekrana basarken tekrar etmesin diye
        for (int i=0; i< dizi.length; i++){
            for (int j=0; j< dizi.length; j++){
                if ((i!=j) && dizi[i]==dizi[j])
                    dizi[i]=0;
            }
        }
        
        // dizi 2 aslında dizimizin bir kopyası ekranda düzgün olsun diye bu şekilde bastık.
        // Orjinalinde aynı olan yerlerde 0 yazıyor çünkü
        System.out.println(Arrays.toString(dizi2)); 

        for (int i=0; i< dizi.length;i++){
        // Dizi sayımız kadar dönecek ama aynı olanları 0 yaptığımız için sadece 0 olmayanlar bir kez ekrana basılacak
            
            if ( dizi[i]!=0)
                System.out.println("Dizide " + dizi[i] + " sayısı " + frekans[i] + " kadar tekrar ediyor");
            
            //[0, 0, 2, 0, 10, 0, 0, 0, 12, 23, 56, 7] Dizi Arrayimiz son hali bu şekilde
            //[2, 2, 2, 3, 2,  2, 3, 2,  3,  2, 2,  1] tüm elemanların sayıları bu şekilde tutmuştuk 
            // 0 olmayanların değerlerin sayısı ekrana basılacak. Tıpkı aşağıdaki gibi
            
            //Dizide 2 sayısı 2 kadar tekrar ediyor
            //Dizide 10 sayısı 2 kadar tekrar ediyor
            //Dizide 12 sayısı 3 kadar tekrar ediyor
            //Dizide 23 sayısı 2 kadar tekrar ediyor
            //Dizide 56 sayısı 2 kadar tekrar ediyor
            //Dizide 7 sayısı 1 kadar tekrar ediyor
        }

    }
}
