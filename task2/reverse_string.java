package task2;

import java.util.*;
import java.util.jar.Attributes.Name;

public class reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        String name1 = "";

        for (int i = name.length() - 1; i >= 0; i--) {

            name1 = name1 + name.charAt(i);

        }
        System.out.println(name1);
    }

}
