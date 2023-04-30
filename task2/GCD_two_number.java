package task2;

import java.util.Scanner;

public class GCD_two_number {

    public static void main(String[] args) {
        int a, n1, n2, gcd = 1;
        System.out.println("enter any two number");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        for (a = 1; a <= n1 && a <= n2; ++a) {

            if (n1 % a == 0 && n2 % a == 0) {
                gcd = a;

            }

        }
        System.out.println("g.c.d  is  " + gcd);

    }
}