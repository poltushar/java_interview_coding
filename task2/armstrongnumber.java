package task2;

import java.util.*;

public class armstrongnumber {
    public static void main(String[] args) {

        // armstrong number is 153=1^3+5^3+3^3 the addition is 153
        // step 1:declare mod 10
        // step2:addition and multiply number
        // step3:total number is divided by 10
        // step4: compare number temp &sum using if else condition

        int n, r, sum = 0, temp;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("armstrong number");

        } else {
            System.out.println("not  armstrong number");
        }
    }

}
