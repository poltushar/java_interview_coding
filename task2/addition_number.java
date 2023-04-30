package task2;

import java.util.Scanner;

public class addition_number {

    public static void main(String[] args) {

        System.out.println("enter the 1st number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter the 2nd number");
        Scanner qw = new Scanner(System.in);
        int b = qw.nextInt();

        int c;

        c = a + b;
        System.out.println("the sum of number is " + c);

    }
}
