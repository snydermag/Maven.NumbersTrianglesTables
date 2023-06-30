package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String list = "";
        int i;

        for (i = start; i < stop; i++) {
            if (i % 2 == 0) {
                list += i;
            }
        }
        return list;
    }


    public static String getOddNumbers(int start, int stop) {
        String list = "";
        int i;

        for (i = start; i < stop; i++) {
            if (i % 2 != 0) {
                list += i;
            }
        }
        return list;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String list = "";
        int i;

        for (i = start; i < stop; i += step) {
            list += i * i;
        }
        return list;
    }

    public static String getRange(int start) {
        String list = "";
        int i;

        for (i = 0; i < start; i++) {
            list += i;
        }
        return list;
    }

    public static String getRange(int start, int stop) {
        String list = "";
        int i;

        for (i = start; i < stop; i++) {
            list += i;
        }
        return list;
    }


    public static String getRange(int start, int stop, int step) {
        String list = "";
        int i;

        for (i = start; i < stop; i += step) {
            list += i;
        }
        return list;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String list = "";
        int i;

        for (i = start; i < stop; i += step) {
            int tempNum = 1;
            int j;

            for (j = 1; j <= exponent; j++) {
                tempNum *= i;

            }
            list += tempNum;
        }
        return list;
    }
}
