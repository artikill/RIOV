package util;

import java.util.Scanner;

/**
 * Четвертое задание
 **/

public class Lexicographic implements StringUtil {

    @Override
    public String action() {
        Scanner scanner = new Scanner(System.in);
        String fs = scanner.nextLine();
        String ss = scanner.nextLine();
        System.out.print("Игнорируя регистр: ");
        boolean ignoreCase = scanner.nextBoolean();

        int result = ignoreCase ? fs.compareToIgnoreCase(ss) : fs.compareTo(ss);
        return String.valueOf(result == 0);
    }
}
