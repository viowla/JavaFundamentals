package sum;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        System.out.println("How many numbers?");
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int sum=0;
        System.out.println("Type numbers: ");
        for (int i=0; i<q; i++){
            int num = sc.nextInt();
            sum = sum+num;
        }
        System.out.println("The sum is "+sum);
    }
}
