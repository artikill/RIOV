package util;

import java.util.Scanner;

public class FirstOriginal implements StringUtil {
    @Override
    public String action() {
        Scanner scanner = new Scanner(System.in);
        String originalString = scanner.nextLine();

        for (char c : originalString.toCharArray()) {
            if (originalString.indexOf(c) == originalString.lastIndexOf(c)) return String.valueOf(c);
        }
        return null;
    }
}
