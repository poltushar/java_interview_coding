package task2;

import java.util.*;

public class factorial {

    public static void main(String[] args) {
        int fact = 1;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        System.out.println("the factorial is" + " " + fact);
    }

}
