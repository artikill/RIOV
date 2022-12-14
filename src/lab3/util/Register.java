package util;

import java.util.Scanner;

/**
 * Десятое задание
 **/

public class Register implements StringUtil {
    @Override
    public String action() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.print("В верхний регистр: ");
        boolean b = scanner.nextBoolean();

        return b ? str.toUpperCase() : str.toLowerCase();
    }
}
