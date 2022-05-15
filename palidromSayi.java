public class palidromSayi {
    static boolean isPalidrom(int number){
        int temp,reversNumber=0,lastNumber;
        temp=number;

        while (temp!=0){
            lastNumber=temp%10; // Son basamak değerini alıyoruz
            reversNumber=(reversNumber*10)+lastNumber;
            // Bir sayıyının basamak değerini  arttırmak için o sayıyı 10 ile çarpmalıyız.
            //Reversnumber başta 0*10 dan sıfır geliyor ve Lastumber ı ekleyerek sonradaki sayı başa geliyo
            //Örneğin 247 sayısı
                //7 Sayısı LastNumber => (0*10) + 7 den reverseNumber 7 oldu
                //temp/10 ile sayıyı bir basamak azalttık. Sayımız 24 oldu
                //24 % 10 'dan Last Number 4. ReverseNumber (7*10)+4 ten 74 oldu.
                //2%10 'dan LastNumber 2 oldu. ReverseNumber = (74*10)+2 den 742 oldu
            temp/=10;
        }
        if(number==reversNumber)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalidrom(101));
    }
}
