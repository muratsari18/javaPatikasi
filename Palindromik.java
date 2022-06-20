// Yazının tersten okunuşu ile normal okunuşu aynı mı? Örnek Kavak, aba vb gibi
public class Palindromik {
    static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){ // en uç indexteki karekterleri alacağız i=0 iken j=5 kareketeri i=1 iken j=4 olacak
            if (str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("kavaka"));
    }
}
