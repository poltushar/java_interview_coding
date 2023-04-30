package task2;

import java.util.Scanner;

public class HCF_TWO_NUMBER {
    public static void main(String[] args) {
        int hcf = 0;

        System.out.println("enter two number");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for (int i = 1; i <= n1 || i <= n2; i++) {

            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;

            }

        }
        System.out.println("the hcf is=" + hcf);
    }

}
