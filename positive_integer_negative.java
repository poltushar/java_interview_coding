import java.util.*;

public class positive_integer_negative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if (a > 0) {
            System.out.println("the positive integer");

        } else if (a < 0) {
            System.out.println("the negative integer");
        } else
            System.out.println("zero");

    }
}
