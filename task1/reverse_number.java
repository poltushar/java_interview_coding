package task1;

import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d1, d2, d3, d4, rev;
        // last digit
        d4 = n % 10;
        n = n / 10;
        // second last digit
        d3 = n % 10;
        n = n / 10;
        // second digt
        d2 = n % 10;
        n = n / 10;
        // first digit
        d1 = n % 10;
        rev = d4 * 1000 + d3 * 100 + d2 * 10 + d1;
        System.out.println(rev);

    }

}
