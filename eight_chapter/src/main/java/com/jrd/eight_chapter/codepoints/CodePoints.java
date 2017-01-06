package com.jrd.eight_chapter.codepoints;

/**
 * Created by jakub on 29.11.16.
 */
public class CodePoints {
    public static boolean tylkoLitery(String s) {
        return s.codePoints().allMatch(Character::isAlphabetic);
    }

    public static boolean poprawnyIdentyfikatorJava(String s) {
        if (Character.isAlphabetic(s.charAt(0))) {
            return s.substring(1, s.length())
                    .codePoints().allMatch(c -> Character.isAlphabetic(c) || Character.isDigit(c));
        } else {
            return false;
        }
    }
}