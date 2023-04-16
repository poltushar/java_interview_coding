public class pyyramid_abcd {
    public static void main(String[] args) {

        for (int i = 0; i <= 14; i++) {
            int a = 64;
            for (int j = 14; j > i; j--) {

                System.out.print(" ");

            }
            for (int k = 0; k < (2 * i - 1); k++) {
                a++;
                System.out.print((char) +a);

            }

            System.out.println();

        }

    }

}
