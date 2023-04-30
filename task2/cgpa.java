package task2;

import java.util.Scanner;

public class cgpa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks from subject 1");
        float s1 = sc.nextFloat();
        System.out.println("enter the marks from subject 2");
        float s2 = sc.nextFloat();
        System.out.println("enter the marks from subject 3");
        float s3 = sc.nextFloat();
        System.out.println("enter the marks from subject 4");
        float s4 = sc.nextFloat();
        System.out.println("enter the marks from subject 5");
        float s5 = sc.nextFloat();

        float res = (s1 + s2 + s3 + s4 + s5) / 50;

        System.out.println("CGPA=" + res);

    }

}
