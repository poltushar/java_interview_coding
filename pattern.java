import javax.lang.model.util.ElementScanner14;

public class pattern {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (i + j == 2 || i == 3 || j == 4) {
                    System.out.print("*");

                } else {

                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }

}
