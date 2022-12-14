package util;

import java.util.Scanner;

public class ThreeChar implements StringUtil {
    @Override
    public String action() {
        Scanner scanner = new Scanner(System.in);
        String fs = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < fs.length() - 2; i++) {
            if (result.indexOf(String.valueOf(fs.charAt(i))) != -1) continue;
            if (fs.charAt(i) == fs.charAt(i + 1) && fs.charAt(i + 1) == fs.charAt(i + 2)) result.append(fs.charAt(i));
        }

        return "Количество троиц: " + result.length();
    }
}
