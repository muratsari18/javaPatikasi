import java.util.Scanner;
public class artikYil {
    public static void main(String[] args) {
        int yil;
        Scanner scan = new Scanner(System.in);
        System.out.print("Yil Giriniz: ");
        yil=scan.nextInt();

        if (yil%4==0 || yil%400==0)
            System.out.print(yil + " Bir Artik Yildir ");
        else
            System.out.println(yil + " Bir Artik Yil Degildir");
    }
}
