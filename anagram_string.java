import java.lang.reflect.Array;
import java.util.Arrays;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class anagram_string {
    public static void main(String[] args) {

        String name = "school master ";
        String name1 = "The classroom";

        // step1:remove the white spaces

        name = name.replace(" ", " ");
        name1 = name1.replace("", " ");

        // step2: covert lower case

        name = name.toLowerCase();
        name1 = name1.toLowerCase();

        // step3:convert array

        char[] arr = name.toCharArray();
        char[] arr1 = name1.toCharArray();
        // step4: sort array

        Arrays.sort(arr);
        Arrays.sort(arr1);

        // step5:compare array

        if (Arrays.equals(arr, arr1)) {
            System.out.println("anagram_string");
        } else {
            System.out.println(" not anagram_string");
        }

    }

}
