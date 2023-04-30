package task2;

import java.util.*;

public class primenumber {

    public static void main(String[] args) {

        // step1: the my numer is 7 i.e using loop 2,3,4,5,6, check divided or not
        // step2: if number is divided and remainder is 1 that number is prime
        // step3: if number is remainder is 0 that number is not prime
        // step4:again compare this number

        int i, n, temp = 0;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (i = 2; i <= n - 1; i++) {

            if (n % i == 0) {

                temp = temp + 1;

            }

        }
        if (temp == 0) {
            System.out.println("not prime number");

        } else {
            System.out.println("prime number");
        }

    }
}