public class palindrome_string {

    public static void main(String[] args) {

        // palindram string madhe jar samjha same input dil tar same ch output yenar

        // e.g maddam, 2552

        String name = "maddam";

        String name1 = "";
        for (int i = name.length() - 1; i >= 0; i--) {

            name1 = name1 + name.charAt(i);

        }

        if (name.equals(name1)) {
            System.out.println(" palindrome");
        } else {
            System.out.println(" not palindrome");
        }
    }

}
