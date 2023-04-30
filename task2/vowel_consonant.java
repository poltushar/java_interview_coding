package task2;

import java.util.*;

public class vowel_consonant {

    public static void main(String[] args) {

        System.out.println("enter character");

        Scanner sc = new Scanner(System.in);
        char r = sc.next().charAt(0);

        if (r == 'a' || r == 'A' || r == 'e' || r == 'E' || r == 'i' || r == 'I' || r == 'o' || r == 'O' || r == 'u'
                || r == 'U') {

            System.out.println("vowel");
        } else {
            System.out.println("consonat");
        }

    }
}