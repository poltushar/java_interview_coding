
import java.util.*;

public class even_odd_integer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if (a % 2 == 0) {
            System.out.println("the even number");

        }

        else {
            System.out.println("the odd integer");
        }
    }
}