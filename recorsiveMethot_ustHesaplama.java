import java.util.Scanner;
public class recursiveMethodUsluSayi {
    static int power (){
      Scanner scan = new Scanner(System.in);
        int result=1;
        System.out.print("Taban Değerini Giriniz :");
      int base = scan.nextInt();
        System.out.print("Tavan Değerini Giriniz :");
      int exp = scan.nextInt();
      if (exp==0)
          return 1;


      for (int i =1; i<=exp; i++){
          result*=base;
      }
        System.out.println(result);
        return power();

    }
    public static void main(String[] args) {
        System.out.println(power());
    }
}
