package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String table = "";
        int i;

        for (i = 0; i < 4; i++) {
            int j;

            for (j = 0; j < 4; j++) {
                int tempNum;

                tempNum = (i+1) * (j+1);

                if (tempNum < 10) {
                    table += "  " + tempNum + " |";
                }
                else {
                    table += " " + tempNum + " |";
                }
            }

            table += "\n";

        }


        return table;
    }

    public static String getLargeMultiplicationTable() {
        String table = "";
        int i;

        for (i = 0; i < 10; i++) {
            int j;

            for (j = 0; j < 10; j++) {
                int tempNum;

                tempNum = (i+1) * (j+1);

                if (tempNum < 10) {
                    table += "  " + tempNum + " |";
                }
                else if (tempNum < 100){
                    table += " " + tempNum + " |";
                }
                else {
                    table += tempNum + " |";
                }
            }

            table += "\n";

        }


        return table;
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        int i;

        for (i = 0; i < tableSize; i++) {
            int j;

            for (j = 0; j < tableSize; j++) {
                int tempNum;

                tempNum = (i+1) * (j+1);

                if (tempNum < 10) {
                    table += "  " + tempNum + " |";
                }
                else if (tempNum < 100){
                    table += " " + tempNum + " |";
                }
                else {
                    table += tempNum + " |";
                }
            }

            table += "\n";

        }

        return table;
    }
}
