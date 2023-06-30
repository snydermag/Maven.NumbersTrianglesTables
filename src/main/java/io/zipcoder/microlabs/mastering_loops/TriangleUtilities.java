package io.zipcoder.microlabs.mastering_loops;

import java.util.Arrays;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String triangle = "";
        int i;

        for (i = 0; i < numberOfRows; i++){
            int j;

            for (j = 0; j <= i; j++){
                triangle += "*";
            }
            triangle += "\n";
        }

        return triangle;

    }

    public static String getRow(int numberOfStars) {
        String stars = "";
        int i;

        for (i = 0; i < numberOfStars; i++) {
            stars += "*";
        }
        return stars;
    }

    public static String getSmallTriangle() {
        String smallTriangle = "";
        int i;

        for (i = 0; i < 4; i++){
            int j;

            for (j = 0; j <= i; j++){
                smallTriangle += "*";
            }
            smallTriangle += "\n";
        }

        return smallTriangle;
    }

    public static String getLargeTriangle() {
        String largeTriangle = "";
        int i;

        for (i = 0; i < 10; i++){
            int j;

            for (j = 0; j <= i; j++){
                largeTriangle += "*";
            }
            largeTriangle += "\n";
        }

        return largeTriangle;
    }
}
