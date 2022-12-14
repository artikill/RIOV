package util;

import java.util.Scanner;

/**
 * Первое задание
 **/

public class Palindrome implements StringUtil {

    @Override
    public String action() {
        Scanner scanner = new Scanner(System.in);
        String requestString = scanner.nextLine();

        String reverseRequest = new StringBuilder(requestString).reverse().toString();

        return requestString.equals(reverseRequest)
                ? requestString + " - палиндром."
                : requestString + " - обычное слово.";
    }

}
