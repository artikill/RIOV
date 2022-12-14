package util;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Третье задание
 **/

public class Anagram implements StringUtil {

    @Override
    public String action() {
        HashMap<Character, Integer> firstMap = new HashMap<>();
        HashMap<Character, Integer> secondMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        String fs = scanner.nextLine();
        String ss = scanner.nextLine();

        fillMap(firstMap, fs);
        fillMap(secondMap, ss);

        if (firstMap.keySet().size() != secondMap.keySet().size()) return fs + " и " + ss + " - не анаграммы";

        for (Character c : firstMap.keySet()) {
            if (!firstMap.get(c).equals(secondMap.get(c))) return fs + " и " + ss + " - не анаграммы";
        }

        return fs + " и " + ss + " - анаграммы";
    }

    private static void fillMap(HashMap<Character, Integer> map, String str) {
        for (char c : str.toCharArray()) {
            int value = map.containsKey(c)
                    ? map.get(c) + 1
                    : 1;
            map.put(c, value);
        }
    }
}
