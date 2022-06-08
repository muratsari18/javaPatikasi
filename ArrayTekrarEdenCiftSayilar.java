public class TekrarEdenCiftSayi {
    static boolean isFind(int [] arr,int value){
        for (int i:arr){
            if (i==value)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] list = {1,2,6,1,4,2,6,4,7,9,12,13,12};
        int [] dublicated = new int[list.length];
        int setIndex=0;
        for (int i=0; i< list.length;i++){
            for (int j=0; j< list.length; j++){
                //indexler eşit değilse, çiftse ve değerleri birbirine eşitse : dublicated arraya o değerleri ata.
                if (i!=j && (list[j]%2==0) && list[i]==list[j])
                    if (!isFind(dublicated,list[j])) // Birden fazla yazmayı engellemek için koşul
                        dublicated[setIndex++]=list[i];
            }
        }
        for (int value: dublicated){
            if (value!=0)
                System.out.println(value);
        }
    }
}
