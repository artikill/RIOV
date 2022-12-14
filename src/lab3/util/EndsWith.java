package util;

import java.util.Scanner;

/**
 * Седьмое задание
 **/

public class EndsWith implements StringUtil {

    @Override
    public String action() {
        Scanner scanner = new Scanner(System.in);
        String fs = scanner.nextLine();
        String ss = scanner.nextLine();

        return fs.endsWith(ss)
                ? fs + " заканчивается на " + ss
                : fs + " не заканчивается на " + ss;
    }

}
