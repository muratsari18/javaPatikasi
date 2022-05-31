public class Main {
    public static void main(String[] args) {
        double sum=0.0;
        int [] numbers = {1,2,3,6,8,4,89};
        for (int i = 0; i< numbers.length; i++){
            sum +=1.0/numbers[i];
        }
        double avarage = sum / numbers.length;
        System.out.println(avarage);
    }
}
