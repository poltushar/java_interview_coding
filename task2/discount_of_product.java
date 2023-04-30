package task2;

import java.util.Scanner;

public class discount_of_product {
    public static void main(String[] args) {
        double marketprice, discountrate, result, payamount;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marketprice");
        marketprice = sc.nextDouble();
        System.out.println("enter the discountrate");
        discountrate = sc.nextDouble();

        payamount = 100 - discountrate;
        result = (payamount * marketprice) / 100;
        System.out.println("payable amount " + result);

    }
}
