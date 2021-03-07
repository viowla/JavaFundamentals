package random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        System.out.println("How many numbers?");
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        for (int i=0; i<n; i++){
            int a=random.nextInt();
            arr.add(a);
            System.out.println(arr.get(i));
        }

        System.out.println(arr);
    }
}
