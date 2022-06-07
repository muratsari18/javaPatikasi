import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int [] list = {15,12,788,1,-1,-778,2,0};

        int [] maxArr= new int[list.length];
        int [] minArr= new int[list.length];

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        int number = scan.nextInt();
        int a = 0; int b=0;


        for (int i = 0; i< list.length; i++){
            if (list[i]>number){
                maxArr[b]=list[i];
                b++;
            }
            if (list[i]<number){
                minArr[a]=list[i];
                a++;
            }


            }

        int max = maxArr[0];
        int min=minArr[0];

        for (int i : maxArr)
        {
            if (i< max && i>number){
                max=i;
            }

        }
        for (int i: minArr) {
            if (i>min && i<number){
                min=i;
            }


            }
        System.out.println(min + " en yakın küçük değer");
        System.out.println(max + " en yakın büyük değer");

        }
    }
