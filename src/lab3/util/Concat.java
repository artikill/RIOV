package util;

import java.util.Scanner;

/**
 * Пятое задание
 **/

public class Concat implements StringUtil {

    @Override
    public String action() {
        Scanner scanner = new Scanner(System.in);
        String fs = scanner.nextLine();
        String ss = scanner.nextLine();

        return fs.concat(ss);
    }
}
