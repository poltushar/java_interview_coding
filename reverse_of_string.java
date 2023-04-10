import java.util.*;

public class reverse_of_string {
    public static void main(String[] args) {

        // reverse of string
        // step1: define string
        // step2:create int len and using string length
        // step3: craete rev(temperory ) variable
        // step4: using for loop staring at name.length()-1 and condition deside 0 and
        // decrement
        // step:5: rev=rev+name.charAt(i) use
        // step6: for loop ended you can write sout
        System.out.println("enter the name");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        int len = name.length();
        String rev = " ";
        for (int i = name.length() - 1; i >= 0; i--) {

            rev = rev + name.charAt(i);

        }
        System.out.println(rev);
    }
}
