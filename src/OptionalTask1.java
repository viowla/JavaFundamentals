import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OptionalTask1 {
    public static void main(String[] args) {
        System.out.println("How many numbers?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Type numbers: ");
        List<Integer> numArr = new ArrayList<Integer>();
        for (int i=0; i<n;i++){
            int num = sc.nextInt();
            numArr.add(num);
            for (int nums : numArr){
                int res = 0;
                int cnt[] = new int[10];
                while (nums > 0) {
                    int rem = nums % 10;
                    cnt[rem]++;
                    nums = nums / 10;
                }
                for (int j = 0; j < 10; j++){
                    if (cnt[j] > 1){
                        res++;
                        }
                }
                        if (res == 0){
                            System.out.println("Here " + num);
                            System.exit(0);}
            }
    }}
}
