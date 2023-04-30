
public class reverse_string_another1 {
    public static void main(String[] args) {

        String name = "tushar pol";
        String name1 = " ";
        String arr[] = name.split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {

            name1 = name1 + arr[i] + " ";

        }
        System.out.println(name1);

    }
}