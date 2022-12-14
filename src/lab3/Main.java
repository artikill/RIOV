import util.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<StringUtil> utilList = List.of(
                new Anagram(), new Concat(), new EndsWith(), new EqualsBuffer(), new FirstOriginal(),
                new IntegerSum(), new Lexicographic(), new NonDuplicator(), new Palindrome(), new Register(),
                new SimpleEquals(), new SimpleLength(), new StartWithStop(), new ThreeChar()
        );

        utilList.forEach(util -> System.out.println(util.action()));
    }
}