package util;

import java.util.Scanner;

/**
 * Второе задание
 **/

public class NonDuplicator implements StringUtil {

    @Override
    public String action() {
        Scanner scanner = new Scanner(System.in);
        String requestString = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        for (char c : requestString.toCharArray()) {
            if (sb.indexOf(String.valueOf(c)) == -1) sb.append(c);
        }

        return sb.toString();
    }


}
