package task2;

import java.util.Scanner;

public class sum_of_digits_of_a_number_in_java {
    public static void main(String[] args) {
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (sum = 0; n != 0; n = n / 10) {

            n = n % 10;

            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println(sum);
    }
}