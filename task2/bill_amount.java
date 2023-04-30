package task2;

import java.util.*;

public class bill_amount {

    public static void main(String[] args) {

        double unit;
        double total = 0;
        System.out.println("enter your electricity consumption:");
        Scanner sc = new Scanner(System.in);
        unit = sc.nextInt();

        if (unit <= 50) {
            total = unit * 0.5;

        }

        else if (unit <= 150) {
            total = (50 * 0.5) + ((unit - 50) * 0.75);

        } else if (unit <= 250) {
            total = (50 * 0.5) + (100 * 0.75) + ((unit - 150) * 1.20);

        } else {
            total = (50 * 0.5) + (100 * 0.75) + (100 * 1.20) + ((unit - 250) * 1.5);

        }
        total = total + total * 0.2;
        System.out.println("your total bill is RS=" + total);

    }
}
