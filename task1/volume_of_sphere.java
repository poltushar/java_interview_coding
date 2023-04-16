package task1;

import java.util.function.DoubleUnaryOperator;

public class volume_of_sphere {
    public static void main(String[] args) {
        double volume_of_sphere;
        double radius = 3;

        volume_of_sphere = (4 / 3.0) * 3.14 * radius * radius * radius;
        System.out.println(volume_of_sphere);
    }

}
