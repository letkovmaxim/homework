import java.util.Random;

public class Task10 {

    public static void main(String[] args) {
        Random rn = new Random();

        int[][] arr = new int[6][7];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = rn.nextInt(9);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < 6; i++){
            int max = arr[i][0];
            int max_j = 0;

            for (int j = 1; j < 7; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    max_j = j;
                }
            }

            int tmp = max;
            arr[i][max_j] = arr[i][0];
            arr[i][0] = max;

        }

        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
