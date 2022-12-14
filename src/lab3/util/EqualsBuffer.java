package util;

import java.util.Scanner;

/**
 * Шестое задание
 **/

public class EqualsBuffer implements StringUtil{
    @Override
    public String action() {
        Scanner scanner = new Scanner(System.in);
        String fs = scanner.nextLine();
        StringBuffer sb = new StringBuffer(scanner.nextLine());

        return String.valueOf(sb.toString().equals(fs));

    }
}
