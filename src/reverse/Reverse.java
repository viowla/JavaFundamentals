package reverse;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; true; i++){
            StringBuffer sb = new StringBuffer(sc.next());
            sb.reverse();
            System.out.println(sb.toString());
        }
    }
}
