import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int km, yas, yolculuktipi;
        double tutar = 0, indirimliTutar = 0, yasindirim = 0, biletindirim = 0,net=0;

        boolean isError = false;
        Scanner scan = new Scanner(System.in);

        System.out.print("Mesafe kac km?:");
        km = scan.nextInt();
        if (km <= 0)
            isError = true;
        System.out.print("Yas?:");
        yas = scan.nextInt();
        if (yas <= 0)
            isError = true;

        System.out.println("Yolculuk Tipi:\n1-Tek Gidis:\n2-Gidis Donus:");
        yolculuktipi = scan.nextInt();

        tutar = km * 0.10;

        if (yas < 12)
            yasindirim = tutar * 0.5;
        else if (yas >= 12 && yas <= 24)
            yasindirim = tutar * 0.1;
        else if (yas > 65)
            yasindirim = tutar * 0.3;
        else
            yasindirim = tutar * 0;

        indirimliTutar = tutar - yasindirim;

        switch (yolculuktipi) {
            case 1:
                biletindirim = indirimliTutar * 0;
                net=indirimliTutar;
                break;
            case 2:
                biletindirim = indirimliTutar * 0.2;
                net = (indirimliTutar - biletindirim)*2;
                break;
            default:
                isError = true;
        }


        if (isError)
            System.out.println("Gecerli Degerler Giriniz.");
        else
            System.out.println("Normal Tutar :" +net);

    }
}
