package task1;

public class t {

    public static void main(String[] args) {
        String name = "suyash";
        String nameq = " ";

        for (int i = name.length() - 1; i >= 0; i--)

        {

            nameq = nameq + name.charAt(i);

        }
        System.out.println(nameq);

    }
}
