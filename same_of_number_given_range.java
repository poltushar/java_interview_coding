import java.util.Scanner;

public class same_of_number_given_range {
    public static void main(String[] args) {
        int i, j, sum = 0;

        System.out.println("enter the two integer");
        Scanner scan = new Scanner(System.in);
        i = scan.nextInt();
        j = scan.nextInt();

        while (i <= j)

        {
            sum = sum + i;
            // System.out.println(i);
            i++;

        }
        System.out.println(sum);

    }

}
