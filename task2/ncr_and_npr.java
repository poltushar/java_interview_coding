package task2;

import java.util.Scanner;

public class ncr_and_npr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter n and r values");
        int n = sc.nextInt();
        int r = sc.nextInt();

        int ncr = 1;
        int npr = 1;
        for (int i = 1; i <= r; i++) {
            ncr = ncr * n / i;
            npr = npr * n;
            n--;

        }
        System.out.println("ncr=" + ncr);
        System.out.println("npr=" + npr);

    }
}
