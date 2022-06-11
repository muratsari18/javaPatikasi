import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("Dizinin eleman sayısını giriniz: ");
    int n= scan.nextInt();
    int [] arr = new int[n];
    for (int i =0; i< arr.length; i++){
        int count=0;
        System.out.print((i+1) + ". Elemanı giriniz:");
        arr[i]= scan.nextInt();
        if (count== arr.length)
            break;
        count ++;

    }
    Arrays.sort(arr);

for (int i=0; i< arr.length;i++){
    System.out.print(arr[i]+",");
}


    }
}
