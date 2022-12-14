package util;

import java.util.Scanner;

/**
 * Восьмое задание
 **/

public class SimpleEquals implements StringUtil{

    @Override
    public String action() {
        Scanner scanner = new Scanner(System.in);
        String fs = scanner.nextLine();
        String ss = scanner.nextLine();

        return fs.equalsIgnoreCase(ss) ? "Строки идентичны" : "Строки различаются";
    }

}
