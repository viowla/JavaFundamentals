package hello;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Type your name: ");
        Scanner sc = new Scanner(System.in);
        String names = sc.next();
        String[] namesArr = names.split(",");
        for (String name : namesArr) {
            System.out.println("Hello " + name + "!");
        }
    }
}
