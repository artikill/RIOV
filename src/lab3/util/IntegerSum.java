package util;

import java.util.Scanner;

public class IntegerSum implements StringUtil{
    @Override
    public String action() {
        Scanner scanner = new Scanner(System.in);
        String originalString = scanner.nextLine();
        int result = 0;

        String nums = originalString.replaceAll("[^0-9]", "");
        for (char c : nums.toCharArray()) {
            result += Integer.parseInt(String.valueOf(c));
        }
        return "Сумма = " + result;
    }
}
