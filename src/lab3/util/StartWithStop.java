package util;

import java.util.Scanner;

/**
 * Одиннадцатое задание
 **/

public class StartWithStop implements StringUtil {

    @Override
    public String action() {
        Scanner scanner = new Scanner(System.in);
        String fs = scanner.nextLine();
        String cut = fs.substring(0, 2);

        return String.valueOf(fs.endsWith(cut));
    }

}
