public class pyramid {

    public static void main(String[] args) {

        for (int i = 0; i <= 12; i++) {
            for (int j = 11; j >= i; j--) {
                System.out.print(" ");

            }
            for (int k = 0; k < (2 * i - 1); k++) {

                System.out.print("*");

            }
            System.out.println();
        }

    }

}
