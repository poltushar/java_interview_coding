public class reverse_string_another2 {
    public static void main(String[] args) {
        System.out.println("before revering=rushikesh");
        String name = " rushikesh";
        String name2 = " ";

        for (int i = name.length() - 1; i >= 0; i--) {
            name2 = name2 + name.charAt(i);

        }
        System.out.println("after reversing=" + name2);

    }
}
