import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class OptionalTask2 {
    public static void main(String[] args) {
        System.out.println("Type array length/height: ");
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int n = sc.nextInt();
        System.out.println("Type random range:");
        int m=sc.nextInt();
        int[][] a = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                a[i][j] = random.ints(-m, m)
                        .findFirst()
                        .getAsInt();
                int[] numTemp = Stream.of(a).flatMapToInt(Arrays::stream).sorted().toArray();
                for (int row = 0; row < n; row++) {
                    for (int col = 0; col < n; col++) {
                        a[row][col] = numTemp[row * n + col];
                    }
                }
            }
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }
    }
}
