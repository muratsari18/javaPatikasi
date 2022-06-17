public class Main {
  
  //Her seferinde aarayi yazıdır ama satır ve sutun uzunluklarını değiştir Transpoze da basarken de array[j][k] olarak bas
    public static void main(String[] args) {
        int[][] arr = new int[][]{{2, 3, 4}, {5, 6, 7}};
        System.out.println("Matris :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("Transpoze :");
        for (int i=0; i<arr[0].length;i++){
            for (int j=0; j< arr.length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
