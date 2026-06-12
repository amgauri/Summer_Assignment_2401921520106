package WEEK2.Day5;

import java.util.*;

public class StringCompression {

    public int compress(char[] chars) {
        int writeAt = 0;
        int scanAt = 0;

        while (scanAt < chars.length) {
            char current = chars[scanAt];
            int start = scanAt;

            // same character ka group count karo
            while (scanAt < chars.length && chars[scanAt] == current) {
                scanAt++;
            }

            int times = scanAt - start;
            chars[writeAt] = current;
            writeAt++;

            // count 1 se zyada ho to digits bhi write karo
            if (times > 1) {
                String countText = String.valueOf(times);

                for (int k = 0; k < countText.length(); k++) {
                    chars[writeAt] = countText.charAt(k);
                    writeAt++;
                }
            }
        }

        return writeAt;
    }

    public static void main(String[] args) {
        StringCompression task = new StringCompression();

        char[] arr = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        int newLength = task.compress(arr);

        System.out.println("Length: " + newLength);
        System.out.println(Arrays.toString(Arrays.copyOf(arr, newLength)));
    }
}