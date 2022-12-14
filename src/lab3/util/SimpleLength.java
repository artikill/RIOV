package util;

import java.util.Scanner;

/**
 * Девятое задание
 **/

public class SimpleLength implements StringUtil {
    @Override
    public String action() {
        return String.valueOf(new Scanner(System.in).nextLine().length());
    }
}
