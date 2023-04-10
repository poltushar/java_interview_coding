import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        int t = x;

        for (int i = 2; i < x; i++) {

            if (x % 2 == 0) {
                System.out.println("not prime");
                break;

            }
            if (x == t) {
                System.out.println("the prime number");
                break;
            }
        }

    }

}
